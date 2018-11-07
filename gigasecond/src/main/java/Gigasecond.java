import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
	
	private LocalDate birthDate;
	private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
		this.birthDate = birthDate;
		this.birthDateTime = birthDate.atTime(0, 0);
	}

    Gigasecond(LocalDateTime birthDateTime) {
		this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
    	return birthDateTime.plusSeconds(1000000000);
    }

}
