package exercicio_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class GerenciaData {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();

		Integer dia, mes, ano, hora, minuto, segundo;

		String diaInput = JOptionPane.showInputDialog("Dia?");
		String mesInput = JOptionPane.showInputDialog("Mes?");
		String anoInput = JOptionPane.showInputDialog("Ano?");
		String horaInput = JOptionPane.showInputDialog("Hora?");
		String minutoInput = JOptionPane.showInputDialog("Minuto?");
		String segundoInput = JOptionPane.showInputDialog("Segundo?");

		if (diaInput.isEmpty()) {
			dia = calendar.get(Calendar.DAY_OF_MONTH);
		} else {
			dia = Integer.parseInt(diaInput);
		}

		if (mesInput.isEmpty()) {
			mes = calendar.get(Calendar.MONTH) + 1;
		} else {
			mes = Integer.parseInt(mesInput);
		}

		if (anoInput.isEmpty()) {
			ano = calendar.get(Calendar.YEAR);
		} else {
			ano = Integer.parseInt(anoInput);
		}

		if (horaInput.isEmpty()) {
			hora = calendar.get(Calendar.HOUR);
		} else {
			hora = Integer.parseInt(horaInput);
		}

		if (minutoInput.isEmpty()) {
			minuto = calendar.get(Calendar.MINUTE);
		} else {
			minuto = Integer.parseInt(minutoInput);
		}

		if (segundoInput.isEmpty()) {
			segundo = calendar.get(Calendar.SECOND);
		} else {
			segundo = Integer.parseInt(segundoInput);
		}

		System.out.println("------------ Data inserida ------------");
		System.out.println(dia + "-" + mes + "-" + ano + " " + hora + ":" + minuto + ":" + segundo);

		System.out.println("-------------- Data atual -------------");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(simpleDateFormat.format(Calendar.getInstance().getTime()));

	}

}
