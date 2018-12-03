 public class Main {
	
		public static void main(String[] args) {
			
			DAO<Agencia> dao = new DAO<Agencia>();
			Agencia p = new Agencia();
			p.setId(22l);
			p.setNome("Mamae");
			dao.save(p);
			Agencia p2 = new Agencia();
			p2.setId(23l);
			p2.setNome("mamis");
			dao.save(p2);
			Agencia find = dao.find(Agencia.class, 22l);
			System.out.println(find.getNome());
	}
		
}

