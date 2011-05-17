package ua.kpi.kramarenko.api.jdbc;

import ua.kpi.kramarenko.api.hotel.beans.Room;

public interface RoomDao {
	
	public Room[] selectAll();
	public Room[] selectAllAvailable();
	public Room[] selectWhereIdIs(int id);
	public Room[] selectWhereRoomClassIs(String roomClass);
	public Room[] selectWhereRoomTypeIs(String roomType);
	public Room[] selectWhereRoomCapasityIs(int roomCapasity);
	public Room[] selectWhereRateIs(float rate);
	public Room[] selectWhereDescriptionIs(String description);

}
