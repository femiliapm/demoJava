package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;

public class DateTest {
	public DateTest() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now(); // yyyy-MM-ddThh:mm:ss.zzz

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
		String formatted = dateTime.format(formatter);

		String date2 = "27-Sep-2019";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate convert = LocalDate.parse(date2, formatter2);

		LocalDate tomorrow = date.plusDays(1);
		LocalDate fiveDaysAgo = date.minusDays(11);
		Integer hari = date.getDayOfMonth();
		Integer besok = fiveDaysAgo.getDayOfMonth();
		Integer interval = besok - hari;

		System.out.println("Tanggal hari ini: " + date); // yyyy-MM-dd
		System.out.println("Waktu saat ini: " + time); // hh:mm:ss.zzz
		System.out.println("Tanggal & waktu saat ini: " + dateTime);
		System.out.println("Setelah di format: " + formatted);
		System.out.println("Converted: " + convert);
		System.out.println("Tanggal besok: " + tomorrow);
		System.out.println("5 hari kebelakang" + fiveDaysAgo);
		System.out.println(interval);
	}

	public static void main(String[] args) {
		new DateTest();
		
//		List<Integer> list = new ArrayList<>();
	}
}
