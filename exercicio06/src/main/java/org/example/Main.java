package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.avaliebleMovies.add(new Movie("Insterstellar",18,14));
        cinema.avaliebleMovies.add(new Movie("MamaMia",10,10));
        cinema.avaliebleMovies.add(new Movie("Fast&Furious",15,14));
        cinema.avaliebleMovies.add(new Movie("The Exorcist",22,18));
        cinema.avaliebleMosvies.add(new Movie("ToyStory",12,10));

        while(true){
            Ticket ticket = new Ticket();

            System.out.println("Digite o nome do cliente:");
            String name = scanner.nextLine();
            System.out.println("Digite a adade:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite o nome do filme desejado:");
            String movieName = scanner.nextLine();
            System.out.println("Assento desejado(A1 - F5):");
            String bench = scanner.nextLine();

            Client client = new Client();
            client.setAge(age);
            client.setName(name);

            Movie movie = cinema.getMovie(movieName);

            if (movie == null) {
                throw new Exception("Esse filme não esta no catalogo!");
            }
            if(movie.minimumAge > client.getAge()){
                throw new Exception("Esse filme não é indicado para a faixa etaria!");
            }

            ticket.bench = bench;
            ticket.client = client;
            ticket.movie = movie;

            cinema.soldsTickets.add(ticket);

            System.out.println("Você comprou um ingresso!");
            System.out.println("Deseja comprar outro? (S ou N)");
            String option = scanner.nextLine().toUpperCase();

            if (!option.equals("N")) {
                break;
            }
        }
        scanner.close();
    }



}
