package common;

/*
 * 地图的点
 */
public class MapPoint {

	public MapPoint(int x, int y, int weight) {
		m_location = new Location(x, y);
		m_weight = weight;
	}

	/*
	 * 获取权重
	 */
	public int getWeight() {
		return m_weight;
	}

	/*
	 * 获取位置信息
	 */
	public Location getLocation() {
		return m_location;
	}

	// 位置
	private Location m_location;

	// 权重
	private int m_weight;
}
