package common;

/*
 * 地图类
 */
public interface IMap {
	
	/*
	 * 初始化地图
	 */
	void init(int x, int y);
	
	/*
	 * 获取地图定点
	 */
	MapPoint getMapPoint(Location location);
	
	/*
	 * 获取两点间带权重距离
	 */
	int getDistanceWithWeight(MapPoint x, MapPoint y);
	
	/*
	 * 获取地图尺寸
	 */
	Location getSize();
}
