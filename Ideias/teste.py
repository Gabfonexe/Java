import geopandas as gpd
from shapely.geometry import Point

# Carregar o shapefile
shapefile_path = 'caminho/para/seu/shapefile.shp'
gdf = gpd.read_file(shapefile_path)

# Adicionar colunas com área e perímetro
gdf['area'] = gdf.geometry.area
gdf['perimeter'] = gdf.geometry.length

# Filtrar telhados com base em critérios de área e perímetro
# Esses valores são exemplos; ajuste conforme necessário
area_threshold_min = 50
perimeter_threshold_min = 30

# Heurística para identificar telhados (ajuste conforme necessário)
telhados = gdf[(gdf['area'] > area_threshold_min) & (gdf['perimeter'] > perimeter_threshold_min)]

# Calcular os centroides dos telhados
telhados['centroid'] = telhados.geometry.centroid

# Criar um GeoDataFrame para os pontos dos telhados
points = gpd.GeoDataFrame(telhados[['centroid']], geometry='centroid')

# Ajustar o CRS (Sistema de Referência de Coordenadas) se necessário
points.set_crs(gdf.crs, inplace=True)

# Exportar para um novo shapefile
output_shapefile_path = 'caminho/para/arquivo_pontos_telhados.shp'
points.to_file(output_shapefile_path, driver='ESRI Shapefile')

print(f'Novo shapefile com pontos dos telhados criado em: {output_shapefile_path}')