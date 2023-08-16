import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDate dataA = LocalDate.now();
		
		//Instanciar data com AGORA
		System.out.println("Data A: " + dataA.toString());
		
		//Instanciar data e hora com AGORA
		LocalDateTime dataB = LocalDateTime.now();
		System.out.println("\nData B: " + dataB );
		
		//Instanciar data e hora Global com AGORA
		Instant dataC = Instant.now();
		System.out.println("\nData C: " + dataC );
		
		//Instanciar data LOCAL com data específica
		LocalDate dataD = LocalDate.parse("2023-02-10");
		System.out.println("\nData D: " + dataD );

		//Instanciar data e hora LOCAL com data específica
		LocalDateTime dataE = LocalDateTime.parse("2023-02-10T01:00");
		System.out.println("\nData E: " + dataE );
		
		//Instanciar data e hora Global com data específica
		Instant dataF = Instant.parse("2023-02-10T01:00:11-03:00");
		System.out.println("\nData F: " + dataF );
		
		DateTimeFormatter formatoA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoB = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("\nData E com formatadoA: " + dataE.format(formatoA) );
		System.out.println("\nData E com formatadoB: " + dataE.format(formatoB) );
		
		DateTimeFormatter formatoC = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Libya"));
		System.out.println("\nData C na Líbia: " + formatoC.format(dataC) );
		
		LocalDate dataG = LocalDate.of(2023, 10, 31);
		System.out.println("\nData G: " + dataG );

		LocalDateTime dataH = LocalDateTime.of(2023, 10, 31, 20, 10);
		System.out.println("\nData H: " + dataH );
		
		//Data LOCAL com instância em um padrão de data personalizado
		LocalDate dataI = LocalDate.parse("20/10/2023", formatoA);
		System.out.println("\nData I: " + dataI);

		LocalDateTime d1 = LocalDateTime.parse("2023-03-12T01:10:00");
		Instant d2 = Instant.parse("2023-03-12T01:10:00z");

		
		System.out.println("Subtraido 2 semanas de " + d1 + ": " + d1.minusWeeks(2));
		System.out.println("Adicionando 8 dias de " + d1 + ": " + d1.plusDays(8));

		Instant novaData = d2.plus(5, ChronoUnit.DAYS);
		System.out.println("Adicionando 5 dias de " + d2 + ": " + novaData);
		
		//Duração entre duas datas
		Instant inicio = Instant.parse("2023-03-12T01:10:00Z");
		Instant fim = Instant.parse("2023-03-12T14:25:00Z");

		Duration t1 = Duration.between(inicio, fim);
		System.out.println("Tempo ocorrido entre inicio e fim: " + t1.toHours() + " Horas");

		
		/*
		for (String i : ZoneId.getAvailableZoneIds()) {
			System.out.println(i);
		}
		*/
		
	}

}
