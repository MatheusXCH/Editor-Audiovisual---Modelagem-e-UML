package br.edu.unifei.ecot12.profissao.editor;

public class App {

	public static void main(String[] args) {
		//Clientes, Solicitacoes e Produtora
		Estrangeiro e = new Estrangeiro();
		e.setIdioma("Inglês");
		e.setMoeda(Moeda.DOLAR_US);
		
		Nacional n = new Nacional();
		n.setEstado("São Paulo");
		
		Empresa empresa1  = new Empresa(e);
		empresa1.setNome("EMP Films");
		empresa1.setDinheiro(2000);
		empresa1.setDinheiro(empresa1.convReal());//converte dolar->real
		empresa1.setCnpj(123456789);
		
		PessoaFisica pessoa1 = new PessoaFisica(n);
		pessoa1.setNome("João");
		pessoa1.setDinheiro(1000);
		pessoa1.setCpf(444888444);
		
		Produtora produtora1 = new Produtora();
		produtora1.setNome("P1 Entertainment");
		produtora1.setCnpj(9899834);
		
		Solicitacao s1 = new Solicitacao();
		s1.setCliente(empresa1);
		s1.setProdutora(produtora1);
		s1.setContrato(1);
		s1.setValor(1700);
		s1.setNomeVideo("'As Redes Sociais'");
		s1.setDataInicio("07/2020");
		s1.setPrazoFinal("08/2020");
		empresa1.getSolicitacao().add(s1);
		
		Solicitacao s2 = new Solicitacao();
		s2.setCliente(empresa1);
		s2.setProdutora(produtora1);
		s2.setContrato(2);
		s2.setNomeVideo("'Meu Melhor Amigo'");
		s2.setValor(3600);
		s2.setDataInicio("07/2020");
		s2.setPrazoFinal("04/2021");
		empresa1.getSolicitacao().add(s2);
		
		Solicitacao s3 = new Solicitacao();
		s3.setCliente(pessoa1);
		s3.setProdutora(produtora1);
		s3.setContrato(3);
		s3.setNomeVideo("'Conheça a BR Produções'");
		s3.setValor(800);
		s3.setDataInicio("07/2020");
		s3.setPrazoFinal("10/2020");
		pessoa1.getSolicitacao().add(s3);
		
		//Estudios, Editores e Equipamentos
		Equipamento equip1 = new Equipamento();
		equip1.setTipoEquipamento("MacBook");
		equip1.setMarca("Apple");
		
		Equipamento equip2 = new Equipamento();
		equip2.setTipoEquipamento("Mesa de Som");
		equip2.setMarca("Yamaha");
		
		Editor editor1 = new Editor();
		editor1.setNome("José");
		editor1.setIdade(22);
		editor1.setPortfolio("A5 Studios");
		editor1.getEquipUtilizados().add(equip1);
		editor1.getEquipUtilizados().add(equip2);
		
		Editor editor2 = new Editor();
		editor2.setNome("Lucas");
		editor2.setIdade(27);
		editor2.setPortfolio("A5 Studios");
		editor2.getEquipUtilizados().add(equip1);
		editor2.getEquipUtilizados().add(equip2);
		
		Editor editor3 = new Editor();
		editor3.setNome("Marcos");
		editor3.setIdade(34);
		editor3.setPortfolio("F6 Studios");
		editor3.getEquipe().add(editor1);
		editor3.getEquipe().add(editor2);
		editor3.getEquipUtilizados().add(equip1);
		editor3.getEquipUtilizados().add(equip2);
		
		Estudio estudio1 = new Estudio();
		estudio1.setNome("P1 Studios");
		estudio1.setLocalizacao("São Paulo");
		editor1.setEstudio(estudio1);
		editor2.setEstudio(estudio1);
		editor3.setEstudio(estudio1);
		estudio1.getEditores().add(editor1);
		estudio1.getEditores().add(editor2);
		estudio1.getEditores().add(editor3);
		estudio1.getEquipamentos().add(equip1);
		estudio1.getEquipamentos().add(equip2);
		produtora1.getEstudios().add(estudio1);
		
		//Softwares
		EdicaoVideo soft1 = new EdicaoVideo();
		soft1.setNome("Adobe Premiere");
		soft1.setDesenvolvedora("Adobe");
		soft1.setPago(true);
		soft1.getEfeito().add(Efeito.CONVOLUCAO);
		soft1.getEfeito().add(Efeito.EXTRAIR);
		soft1.getEfeito().add(Efeito.DESFOQUE);
		soft1.getEfeito().add(Efeito.NITIDEZ);
		soft1.getPosProcessamento().add(PosProcessamento.CANAL_3D);
		soft1.getPosProcessamento().add(PosProcessamento.CORRECAO_CORES);
		soft1.getPosProcessamento().add(PosProcessamento.DISTORCER);
		soft1.getPosProcessamento().add(PosProcessamento.RUIDO_GRANULACAO);
		
		EdicaoVideo plugin1 = new EdicaoVideo();
		plugin1.setNome("Luminous");
		plugin1.setDesenvolvedora("PP Transitions");
		plugin1.setPago(false);
		soft1.getPlugins().add(plugin1);
		
		EdicaoImagem soft2 = new EdicaoImagem();
		soft2.setNome("Adobe Photoshop");
		soft2.setDesenvolvedora("Adobe");
		soft2.setPago(true);
		soft2.setBrilho(50);
		soft2.setContraste(50);
		soft2.getTipoCorte().add(Corte.CORRIGIR);
		soft2.getTipoCorte().add(Corte.LIVRE);
		soft2.getTipoCorte().add(Corte.RETANGULAR);
		soft2.getTipoCorte().add(Corte.ROTACIONAR);
		
		EdicaoAudio soft3 = new EdicaoAudio();
		soft3.setNome("Adobe Audition");
		soft3.setDesenvolvedora("Adobe");
		soft3.setPago(true);
		soft3.setVolume(100);
		soft3.getMixagem().add(Mixagem.CROSSFADE);
		soft3.getMixagem().add(Mixagem.EQUALIZACAO);
		soft3.getMixagem().add(Mixagem.MODULACAO);
		soft3.getMixagem().add(Mixagem.REDUZIR_RUIDO);
		
		equip1.getSoftwares().add(soft1);
		equip1.getSoftwares().add(soft2);
		equip1.getSoftwares().add(soft3);
		equip1.getSoftwares().add(plugin1);//Macbook possui todos os softwares da Adobe
		
		//Videos
		Comercial video1 = new Comercial();
		video1.setNome(s3.getNomeVideo());
		video1.setCodigo(1);
		video1.setFormato("WMV");
		video1.setDuracao(15);
		video1.setCanal("BR Produções");
		video1.setPlataforma("YouTube");
		editor1.getProduzVideo().add(video1);// José faz o Comercial
		
		CurtaMetragem video2 = new CurtaMetragem();
		video2.setNome(s1.getNomeVideo());
		video2.setCodigo(2);
		video2.setFormato("MKV");
		video2.setDuracao(32);
		video2.setDiretor("Júlio");
		video2.setRoteirista("Adriano");
		video2.setIntencao("Educacional");
		video2.setMeioDistribuicao("Redes Sociais");
		editor2.getProduzVideo().add(video2); //Lucas faz o Curta
		
		LongaMetragem video3 = new LongaMetragem();
		video3.setNome(s2.getNomeVideo());
		video3.setCodigo(3);
		video3.setFormato("BD");
		video3.setDuracao(110);
		video3.setDiretor("Amanda");
		video3.setRoteirista("Bianca");
		editor1.getProduzVideo().add(video3);
		editor2.getProduzVideo().add(video3);
		editor3.getProduzVideo().add(video3);//Os 3 editores fazem o Longa
		
		//APLICAÇÃO
		System.out.println("---CONTRATO:\n1º O cliente " +
				s3.getCliente().getNome() + " contratou a produtora " + 
				s3.getProdutora().getNome() + " para que fosse feito um vídeo comercial, denominado \n" +
				s3.getNomeVideo() + ", por meio da solicitacao #" +
				s3.getContrato() +",com contrato estipulado em R$" +
				s3.getValor() +".\n");
		
		double total = s1.getValor() + s2.getValor();
		System.out.println("2º O cliente " +
				s1.getCliente().getNome() + " contratou a produtora " +
				s1.getProdutora().getNome() + " para um curta metragem e um longa metragem, denominados \n" +
				s1.getNomeVideo() + " e " + s2.getNomeVideo() + ", respectivamente. As solicitações são #" + 
				s1.getContrato() + " e #" + s2.getContrato() + ", somando uma negociação total de R$" + 
				total + ".\n");
		
		System.out.println("---PRODUÇÃO:\nA " + produtora1.getNome() + " escolheu o estúdio " +
				produtora1.getEstudios().get(0).getNome() + " para fazer os projetos,  que possui as ferramentas:\n     ." +
				estudio1.getEquipamentos().get(0).getMarca() + " " + estudio1.getEquipamentos().get(0).getTipoEquipamento() + " com " + 
				equip1.getSoftwares().get(0).getNome() + ", " + equip1.getSoftwares().get(1).getNome() + ", " +
				equip1.getSoftwares().get(2).getNome() + " e " + 
				equip1.getSoftwares().get(3).getNome() + "\n     ." +
				estudio1.getEquipamentos().get(1).getMarca() + " " + estudio1.getEquipamentos().get(1).getTipoEquipamento() + "\n");
		
		System.out.println("1º O funcionário " + editor1.getNome() + 
				" ficou responsável por elaborar o vídeo comercial " + editor1.getProduzVideo().get(0).getNome() + 
				", com duração de " + editor1.getProduzVideo().get(0).getDuracao() + " minutos e \nprazo final para entrega em " + 
				s3.getPrazoFinal() + ".\n");
		
		System.out.println("2º O funcionário " + editor2.getNome() + 
				" ficou responsável por elaborar o curta metragem " + editor2.getProduzVideo().get(0).getNome() + 
				", dirigido por " +  video2.getDiretor() + " e escrito por " + video2.getRoteirista() + 
				", \ncom duração de " + editor2.getProduzVideo().get(0).getDuracao() + " minutos e prazo final para entrega em " + 
				s1.getPrazoFinal() + ".\n");

		
		System.out.println("3º A equipe responsável pelo último projeto é composta pelos funcionários: ");
		for(Editor ed : estudio1.getEditores()) {
			System.out.println("    ." + ed.getNome());
		}
		
		System.out.println("que serão responsáveis por elaborar o longa metragem " + editor3.getProduzVideo().get(0).getNome() + 
				", dirigido por " +  video3.getDiretor() + " e escrito por " + video3.getRoteirista() +
				", \ncom duração de " + editor3.getProduzVideo().get(0).getDuracao() + " minutos e prazo final para entrega em " + 
				s2.getPrazoFinal() + ".");
	}
}
