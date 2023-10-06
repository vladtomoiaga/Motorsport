package org.example;

import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Formula One engines
        Engine honda = new Engine("Honda RBPTH001", "V", (byte) 6);
        Engine ferrari = new Engine("Ferrari 066/10", "V", (byte) 6);
        Engine mercedes = new Engine("Mercedes F1 M14 E Performance", "V", (byte) 6);
        Engine renault = new Engine("Renault E-Tech RE23", "V", (byte) 6);

        // Create Formula One teams
        FormulaOneTeam redBullRacing = new FormulaOneTeam("Oracle Red Bull Racing", "Christian Horner", honda, 104, 5, 6, true);
        FormulaOneTeam scuderiaFerrari = new FormulaOneTeam("Scuderia Ferrari", "Frederic Vasseur", ferrari, 241, 16, 15, true);
        FormulaOneTeam mercedesAMGF1Team = new FormulaOneTeam("Mercedes-AMG Petronas F1 Team", "Toto Wolff", mercedes, 125, 8, 9, true);
        FormulaOneTeam alpineF1Team = new FormulaOneTeam("BWT Alpine F1 Team", "Bruno Famim", renault, 1, 0, 0, true);
        FormulaOneTeam astonMartinF1Team = new FormulaOneTeam("Aston Martin Aramco Cognizant F1 Team", "Mike Krack", mercedes, 0, 0, 0, false);
        FormulaOneTeam mclarenF1Team = new FormulaOneTeam("Mclaren F1 Team", "Zak Brown", mercedes, 183, 8, 12, true);
        FormulaOneTeam alfaRomeoF1Team = new FormulaOneTeam("Alfa Romeo F1 Team Stake", "Alessandro Alunni Bravi", ferrari, 10, 0, 2, false);
        FormulaOneTeam williamsRacing = new FormulaOneTeam("Williams Racing", "James Vowles", mercedes, 114, 9, 7, true);
        FormulaOneTeam scuderiaAlphaTauri = new FormulaOneTeam("Scuderia AlphaTauri", "Franz Tost", honda, 1, 0, 0, true);
        FormulaOneTeam haasF1Team = new FormulaOneTeam("MoneyGram Haas F1 Team", "Guenther Steiner", ferrari, 0, 0, 0, false);

        // Create Formula One drivers
        Driver maxVerstappen = new Driver("Max", "Verstappen", redBullRacing, (byte) 33, 45, (byte) 2);
        Driver sergioPerez = new Driver("Sergio", "Perez", redBullRacing, (byte) 11, 6, (byte) 0);
        Driver charlesLeclerc = new Driver("Charles", "Leclerc", scuderiaFerrari, (byte) 16, 5, (byte) 0);
        Driver carlosSainz = new Driver("Carlos", "Sainz", scuderiaFerrari, (byte) 55, 1, (byte) 0);
        Driver lewisHamilton = new Driver("Lewis", "Hamilton", mercedesAMGF1Team, (byte) 44, 103, (byte) 7);
        Driver georgeRussell = new Driver("George", "Russell", mercedesAMGF1Team, (byte) 63, 1, (byte) 0);
        Driver pierreGasly = new Driver("Pierre", "Gasly", alpineF1Team, (byte) 10, 1, (byte) 0);
        Driver estebanOcon = new Driver("Esteban", "Ocon", alpineF1Team, (byte) 31, 1, (byte) 0);
        Driver fernandoAlonso = new Driver("Fernando", "Alonso", astonMartinF1Team, (byte) 14, 32, (byte) 2);
        Driver lanceStroll = new Driver("Lance", "Stroll", astonMartinF1Team, (byte) 18, 0, (byte) 0);
        Driver landoNorris = new Driver("Lando", "Norris", mclarenF1Team, (byte) 4, 0, (byte) 0);
        Driver oscarPiastri = new Driver("Oscar", "Piastri", mclarenF1Team, (byte) 81, 0, (byte) 0);
        Driver valtteriBottas = new Driver("Valtteri", "Bottas", alfaRomeoF1Team, (byte) 77, 10, (byte) 0);
        Driver zhouGuanyu = new Driver("Zhou", "Guanyu", alfaRomeoF1Team, (byte) 24, 0, (byte) 0);
        Driver alexAlbon = new Driver("Alex", "Albon", williamsRacing, (byte) 23, 0, (byte) 0);
        Driver loganSargeant = new Driver("Logan", "Sargeant", williamsRacing, (byte) 2, 0, (byte) 0);
        Driver danielRicciardo = new Driver("Daniel", "Ricciardo", scuderiaAlphaTauri, (byte) 3, 8, (byte) 0);
        Driver yukiTsunoda = new Driver("Yuki", "Tsunoda", scuderiaAlphaTauri, (byte) 22, 0, (byte) 0);
        Driver kevinMagnussen = new Driver("Kevin", "Magnussen", haasF1Team, (byte) 20, 0, (byte) 0);
        Driver nicoHulkenberg = new Driver("Nico", "Hulkenberg", haasF1Team, (byte) 27, 0, (byte) 0);

        // Create Circuits
        GrandPrix bahrainGP = new GrandPrix("Bahrain Grand Prix", "Bahrain International Circuit", "Bahrain", 5412, (byte) 57);
        GrandPrix saudiArabianGP = new GrandPrix("Saudi Arabian Grand Prix", "Jeddah Corniche Circuit", "Saudi Arabia", 6174, (byte) 50);
        GrandPrix australianGP = new GrandPrix("Australian Grand Prix", "Albert Park Circuit", "Australia", 5278, (byte) 58);
        GrandPrix azerbaijanGP = new GrandPrix("Azerbaijan Grand Prix", "Baku City Circuit", "Azerbaijan", 6003, (byte) 51);
        GrandPrix miamiGP = new GrandPrix("Miami Grand Prix", "Miami International Autodrome", "USA", 5412, (byte) 57);
        GrandPrix monacoGP = new GrandPrix("Monaco Grand Prix", "Circuit de Monaco", "Monaco", 3337, (byte) 78);
        GrandPrix spanishGP = new GrandPrix("Spanish Grand Prix", "Circuit de Barcelona-Catalunya", "Spain", 4657, (byte) 66);
        GrandPrix canadianGP = new GrandPrix("Canadian Grand Prix", "Circuit Gilles Villeneuve", "Canada", 4361, (byte) 70);
        GrandPrix austrianGP = new GrandPrix("Austrian Grand Prix", "Red Bull Ring", "Austria", 4318, (byte) 71);
        GrandPrix britishGP = new GrandPrix("British Grand Prix", "Silverstone Circuit", "UK", 5891, (byte) 52);
        GrandPrix hungarianGP = new GrandPrix("Hungarian Grand Prix", "Hungaroring", "Hungary", 4381, (byte) 70);
        GrandPrix belgianGP = new GrandPrix("Belgian Grand Prix", "Circuit de Spa-Francorchamps", "Belgium", 7004, (byte) 44);
        GrandPrix dutchGP = new GrandPrix("Dutch Grand Prix", "Circuit Zandvoort", "Netherlands", 4259, (byte) 72);
        GrandPrix italianGP = new GrandPrix("Italian Grand Prix", "Autodromo Nazionale di Monza", "Italy", 5793, (byte) 53);
        GrandPrix singaporeGP = new GrandPrix("Singapore Grand Prix", "Marina Bay Street Circuit", "Singapore", 4928, (byte) 63);
        GrandPrix japaneseGP = new GrandPrix("Japanese Grand Prix", "Suzuka Circuit", "Japan", 5807, (byte) 53);
        GrandPrix qatarGP = new GrandPrix("Qatar Grand Prix", "Lusail International Circuit", "Qatar", 5418, (byte) 57);
        GrandPrix unitedStatesGP = new GrandPrix("United States Grand Prix", "Circuit of the Americas", "USA", 5513, (byte) 56);
        GrandPrix mexicanGP = new GrandPrix("Mexican Grand Prix", "Autódromo Hermanos Rodríguez", "Mexico", 4304, (byte) 71);
        GrandPrix brazilianGP = new GrandPrix("Brazilian Grand Prix", "Autódromo José Carlos Pace", "Brazil", 4309, (byte) 71);
        GrandPrix lasVegasGP = new GrandPrix("Las Vegas Grand Prix", "Las Vegas Strip Circuit", "USA", 6120, (byte) 50);
        GrandPrix abuDhabiGP = new GrandPrix("Abu Dhabi Grand Prix", "Yas Marina Circuit", "United Arab Emirates", 5281, (byte) 58);

        //Add engines to the list
        LinkedList<Engine> engines = new LinkedList<>();
        engines.add(honda);
        engines.add(ferrari);
        engines.add(mercedes);
        engines.add(renault);
        System.out.println("Formula One engines: " + engines);

        //Add Formula One Teams to the list
        LinkedList<FormulaOneTeam> formulaOneTeams = new LinkedList<>();
        formulaOneTeams.add(redBullRacing);
        formulaOneTeams.add(scuderiaFerrari);
        formulaOneTeams.add(mercedesAMGF1Team);
        formulaOneTeams.add(alpineF1Team);
        formulaOneTeams.add(astonMartinF1Team);
        formulaOneTeams.add(mclarenF1Team);
        formulaOneTeams.add(alfaRomeoF1Team);
        formulaOneTeams.add(williamsRacing);
        formulaOneTeams.add(scuderiaAlphaTauri);
        formulaOneTeams.add(haasF1Team);
        System.out.println("Formula One teams: " + formulaOneTeams);

        //Add Formula One drivers to the list
        LinkedList<Driver> formulaOneDrivers = new LinkedList<>();
        formulaOneDrivers.add(maxVerstappen);
        formulaOneDrivers.add(sergioPerez);
        formulaOneDrivers.add(charlesLeclerc);
        formulaOneDrivers.add(carlosSainz);
        formulaOneDrivers.add(lewisHamilton);
        formulaOneDrivers.add(georgeRussell);
        formulaOneDrivers.add(pierreGasly);
        formulaOneDrivers.add(estebanOcon);
        formulaOneDrivers.add(fernandoAlonso);
        formulaOneDrivers.add(lanceStroll);
        formulaOneDrivers.add(landoNorris);
        formulaOneDrivers.add(oscarPiastri);
        formulaOneDrivers.add(valtteriBottas);
        formulaOneDrivers.add(zhouGuanyu);
        formulaOneDrivers.add(alexAlbon);
        formulaOneDrivers.add(loganSargeant);
        formulaOneDrivers.add(danielRicciardo);
        formulaOneDrivers.add(yukiTsunoda);
        formulaOneDrivers.add(kevinMagnussen);
        formulaOneDrivers.add(nicoHulkenberg);
        System.out.println("Formula One drivers: " + formulaOneDrivers);

        //Add Grand Prix to the list
        LinkedList<GrandPrix> formulaOneGrandsPrix = new LinkedList<>();
        formulaOneGrandsPrix.add(bahrainGP);
        formulaOneGrandsPrix.add(saudiArabianGP);
        formulaOneGrandsPrix.add(australianGP);
        formulaOneGrandsPrix.add(azerbaijanGP);
        formulaOneGrandsPrix.add(miamiGP);
        formulaOneGrandsPrix.add(monacoGP);
        formulaOneGrandsPrix.add(spanishGP);
        formulaOneGrandsPrix.add(canadianGP);
        formulaOneGrandsPrix.add(austrianGP);
        formulaOneGrandsPrix.add(britishGP);
        formulaOneGrandsPrix.add(hungarianGP);
        formulaOneGrandsPrix.add(belgianGP);
        formulaOneGrandsPrix.add(dutchGP);
        formulaOneGrandsPrix.add(italianGP);
        formulaOneGrandsPrix.add(singaporeGP);
        formulaOneGrandsPrix.add(japaneseGP);
        formulaOneGrandsPrix.add(qatarGP);
        formulaOneGrandsPrix.add(unitedStatesGP);
        formulaOneGrandsPrix.add(mexicanGP);
        formulaOneGrandsPrix.add(brazilianGP);
        formulaOneGrandsPrix.add(lasVegasGP);
        formulaOneGrandsPrix.add(abuDhabiGP);
        System.out.println("Formula One Grands Prix: " + formulaOneGrandsPrix);

        //Add points
        LinkedList<Integer> points = new LinkedList<>();
        points.add(Points.FIRST);
        points.add(Points.SECOND);
        points.add(Points.THIRD);
        points.add(Points.FOURTH);
        points.add(Points.FIFTH);
        points.add(Points.SIXTH);
        points.add(Points.SEVENTH);
        points.add(Points.EIGHTH);
        points.add(Points.NINTH);
        points.add(Points.TENTH);

        //Formula One calendar
        formulaOneCalendar(formulaOneGrandsPrix);

        //Formula One grid
        formulaOneGrid(formulaOneDrivers);

        //Formula One races and standings
        createDataBase();
        championshipFormulaOne(formulaOneDrivers, formulaOneGrandsPrix, points);
        driverStandings(formulaOneGrandsPrix);
        constructorStandings(formulaOneGrandsPrix);
    }

        /** Printing the Formula One calendar */
        public static void formulaOneCalendar(LinkedList<GrandPrix> formulaOneGrandsPrix) {
            System.out.println("Formula One calendar is:");
            int i = 1;
            for (GrandPrix formulaOneGrandPrix : formulaOneGrandsPrix) {
                 System.out.println(i + ". " + formulaOneGrandPrix);
                i++;
            }
            System.out.println("----------------------------------------------------------");
        }

        /** Printing the Formula One Driver line up */
        public static void formulaOneGrid(LinkedList<Driver> formulaOneDrivers) {
            System.out.println("The drivers for the the 2023 Formula calendar are:");
            for (Driver formulaOnedriver : formulaOneDrivers) {
             System.out.println(formulaOnedriver);
            }
            System.out.println("----------------------------------------------------------");
        }

      /** Create the database */
      public static void createDataBase(){
          try {
              Connection connection = DriverManager.getConnection(DataSourceName.URL_DATABASE, DataSourceName.USER, DataSourceName.PASSWORD);
              Statement statement = connection.createStatement();
              String dataBase = "SELECT datname FROM pg_catalog.pg_database WHERE datname = '" + DataSourceName.DB_NAME + "'";
              ResultSet resultSet = statement.executeQuery(dataBase);
              if (resultSet.next()) {
                  System.out.println("Database already exists.");
              } else {
                  dataBase = "CREATE DATABASE " + DataSourceName.DB_NAME;
                  statement.executeUpdate(dataBase);
                  System.out.println("Database created successfully.");
              }
              connection.close();
          } catch (SQLException e) {
              System.out.println(e.getMessage());
          }
      }

    /** Creating all the tables in SQL and filled in with the results from each race in the calendar */
    public static void championshipFormulaOne(LinkedList<Driver> formulaOneDrivers, LinkedList<GrandPrix> formulaOneGrandsPrix, LinkedList<Integer> points) {
        try {
            Connection connection = DriverManager.getConnection(DataSourceName.URL, DataSourceName.USER, DataSourceName.PASSWORD);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            for (int r = 0; r < formulaOneGrandsPrix.size(); r++) {
                String formulaOneRaceResults = "Results_" + formulaOneGrandsPrix.get(r).getNameGrandPrix().replaceAll(" ", "_");
                System.out.println("The results after completing " + formulaOneGrandsPrix.get(r).getNumberLaps() + " laps in the " + formulaOneGrandsPrix.get(r) + " is:");
                Collections.shuffle(formulaOneDrivers);
                int j = 1;
                for (Driver formulaOneDriver : formulaOneDrivers) {
                    System.out.println(j + ". " + formulaOneDriver);
                    j++;
                }
                statement.execute("CREATE TABLE IF NOT EXISTS " + formulaOneRaceResults + "" +
                        "(" + DataSourceName.COLUMN_FIRST_NAME + " TEXT, " + DataSourceName.COLUMN_LAST_NAME + " TEXT, " + DataSourceName.COLUMN_TEAM + " TEXT, " + DataSourceName.COLUMN_POINTS + " INTEGER)");
                statement.execute("DELETE FROM " + formulaOneRaceResults + " ");
                for (int k = 0; k <= 9; k++) {
                    statement.executeUpdate("INSERT INTO " + formulaOneRaceResults + " (" + DataSourceName.COLUMN_FIRST_NAME + ", " + DataSourceName.COLUMN_LAST_NAME + ", " + DataSourceName.COLUMN_TEAM + ", " + DataSourceName.COLUMN_POINTS + ")" +
                            "VALUES('" + formulaOneDrivers.get(k).getFirstName() + "','" + formulaOneDrivers.get(k).getLastName() + "','" + formulaOneDrivers.get(k).getTeam() + "', '" + points.get(k) + "')");
                }
                for (int k = 10; k < formulaOneDrivers.size(); k++) {
                    statement.executeUpdate("INSERT INTO " + formulaOneRaceResults + " (" + DataSourceName.COLUMN_FIRST_NAME + ", " + DataSourceName.COLUMN_LAST_NAME + ", " + DataSourceName.COLUMN_TEAM + ", " + DataSourceName.COLUMN_POINTS + ")" +
                            "VALUES('" + formulaOneDrivers.get(k).getFirstName() + "','" + formulaOneDrivers.get(k).getLastName() + "','" + formulaOneDrivers.get(k).getTeam() + "', '" + 0 + "')");
                }
                System.out.println("----------------------------------------------------------");
            }
            connection.commit();
            statement.close();
            connection.close();
        } catch (SQLException e) {
                System.out.println("Error in connecting to PostgreSQL server" + e.getMessage());
                throw new RuntimeException(e);
            }
    }

    /** Creating the driver standings table in SQL and filled in with the results from current season */
        public static void driverStandings(LinkedList<GrandPrix> formulaOneGrandsPrix) {
            String driverStandingsTableName = "driverStandings";
            try {
                Connection connection = DriverManager.getConnection(DataSourceName.URL, DataSourceName.USER, DataSourceName.PASSWORD);
                connection.setAutoCommit(false);
                Statement statement = connection.createStatement();
                statement.execute("CREATE TABLE IF NOT EXISTS " + driverStandingsTableName + " " +
                        "(" + DataSourceName.COLUMN_FIRST_NAME + " TEXT, " + DataSourceName.COLUMN_LAST_NAME + " TEXT, " + DataSourceName.COLUMN_TEAM + " TEXT, " + DataSourceName.COLUMN_POINTS + " INTEGER)");
                statement.execute("DELETE FROM driverStandings");
                String driverStandingsQuery = "INSERT INTO " + driverStandingsTableName + " (" + DataSourceName.COLUMN_FIRST_NAME + ", " + DataSourceName.COLUMN_LAST_NAME + ", " + DataSourceName.COLUMN_TEAM + ", " + DataSourceName.COLUMN_POINTS + ") " +
                        "SELECT " + DataSourceName.COLUMN_FIRST_NAME + ", " + DataSourceName.COLUMN_LAST_NAME + ", " + DataSourceName.COLUMN_TEAM + ", SUM (" + DataSourceName.COLUMN_POINTS + ") FROM (";
                connection.commit();
            for (int r = 0; r < formulaOneGrandsPrix.size(); r++) {
                    String raceResultsFormulaOne = "Results_" + formulaOneGrandsPrix.get(r).getNameGrandPrix().replaceAll(" ", "_");
                    driverStandingsQuery = driverStandingsQuery +
                                "SELECT " + DataSourceName.COLUMN_FIRST_NAME + ", " + DataSourceName.COLUMN_LAST_NAME + ", " + DataSourceName.COLUMN_TEAM + ", " + DataSourceName.COLUMN_POINTS + " FROM "  + raceResultsFormulaOne +
                                " UNION ALL ";
            }
                driverStandingsQuery = driverStandingsQuery.substring(0,driverStandingsQuery.length()-10) + ") AS " + driverStandingsTableName + " GROUP BY " + DataSourceName.COLUMN_FIRST_NAME + ", " + DataSourceName.COLUMN_LAST_NAME + ", " + DataSourceName.COLUMN_TEAM + " ORDER BY SUM DESC";
                statement.executeUpdate(driverStandingsQuery);
                connection.commit();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    /** Creating the constructor standings table in SQL and filled in with the results from current season */
    public static void constructorStandings(LinkedList<GrandPrix> formulaOneGrandsPrix) {
        String constructorStandingsTableName = "constructorStandings";
        try {
            Connection connection = DriverManager.getConnection(DataSourceName.URL, DataSourceName.USER, DataSourceName.PASSWORD);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS " + constructorStandingsTableName + " " +
                    "(" + DataSourceName.COLUMN_TEAM + " TEXT, " + DataSourceName.COLUMN_POINTS + " INTEGER)");
            statement.execute("DELETE FROM " + constructorStandingsTableName + " ");
            String constructorStandingsQuery = "INSERT INTO " + constructorStandingsTableName + " (" + DataSourceName.COLUMN_TEAM + ", " + DataSourceName.COLUMN_POINTS + ") " +
                    "SELECT " + DataSourceName.COLUMN_TEAM + ", SUM (" + DataSourceName.COLUMN_POINTS + ") FROM (";
            connection.commit();
            for (int r = 0; r < formulaOneGrandsPrix.size(); r++) {
                String raceResultsFormulaOne = "Results_" + formulaOneGrandsPrix.get(r).getNameGrandPrix().replaceAll(" ", "_");
                constructorStandingsQuery = constructorStandingsQuery +
                        "SELECT " + DataSourceName.COLUMN_TEAM + ", " + DataSourceName.COLUMN_POINTS + " FROM "  + raceResultsFormulaOne +
                        " UNION ALL ";
            }
            constructorStandingsQuery = constructorStandingsQuery.substring(0,constructorStandingsQuery.length()-10) + ") AS " + constructorStandingsTableName + " GROUP BY " + DataSourceName.COLUMN_TEAM + " ORDER BY SUM DESC";
            statement.executeUpdate(constructorStandingsQuery);
            connection.commit();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}