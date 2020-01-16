package common;

/*
 * 位置信息
 */
public class Location {

	public Location(int x, int y) {
		m_x = x;
		m_y = y;
	}

	/*
	 * 计算位置间距离
	 */
	public static int distance(Location x, Location y) throws Exception {
		if (x == null || y == null) {
			throw new Exception("location cant is null");
		}
		return Math.abs(x.m_x - y.m_x) * Math.abs(x.m_y - y.m_y);
	}

	// x坐标
	public int m_x;

	// y坐标
	public int m_y;
}