public class PTTime {
	
	private int hours;
	private int minutes;
	private int seconds;

	public PTTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public PTTime() {

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder("PTTime = ");
		
		if (hours > 0) {
			stringBuilder.append(String.format("%d hours", hours));
		}

		if (minutes > 0) {
			stringBuilder.append(String.format("%d minutes", minutes));
		}

		if (seconds > 0) {
			stringBuilder.append(String.format("%d seconds", seconds));
		}

		return stringBuilder.toString();
	}
}