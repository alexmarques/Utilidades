public static float calcularJurosProporcionaisAoMes(Calendar dataInicial, Calendar dataFinal) {
		int mesInicialContagem = dataInicial.get(Calendar.MONTH) + 1;
		int mesFinalContagem = dataFinal.get(Calendar.MONTH) + 1;
		int diferencaDeMeses = DateUtils.diff(DateUtils.MONTH, dataInicial.getTime(), dataFinal.getTime());
		float periodo = 0f;
		
		for(int count = 0; count <= diferencaDeMeses; count++) {
			
			int mesDataInicial = dataInicial.get(Calendar.MONTH) + 1;
			int mesDataFinal   = dataFinal.get(Calendar.MONTH) + 1;
			
			if(mesInicialContagem == mesDataInicial) {
				int quantidadeDeDiasDoMes = DateUtils.getDaysOfMonth(dataInicial.get(Calendar.MONTH), dataInicial.get(Calendar.YEAR));
				int diaDataInicial = dataInicial.get(Calendar.DAY_OF_MONTH);
				String quantidadeDeDiasDoMesString = String.valueOf(quantidadeDeDiasDoMes);
				String diaDataInicialString = String.valueOf(diaDataInicial);
				periodo = Long.parseLong(quantidadeDeDiasDoMesString) / Long.parseLong(diaDataInicialString);
				continue;
			}
			
			if(mesFinalContagem == mesDataFinal) {
				int quantidadeDeDiasDoMes = DateUtils.getDaysOfMonth(dataFinal.get(Calendar.MONTH), dataInicial.get(Calendar.YEAR));
				int diaDataFinal = dataFinal.get(Calendar.DAY_OF_MONTH);
				String quantidadeDeDiasDoMesString = String.valueOf(quantidadeDeDiasDoMes);
				String diaDataFinalString = String.valueOf(diaDataFinal);
				periodo = Long.parseLong(quantidadeDeDiasDoMesString) / Long.parseLong(diaDataFinalString);
				continue;
			}
			
			periodo += 1.0f;
		}
		
		return periodo;
		
	}
