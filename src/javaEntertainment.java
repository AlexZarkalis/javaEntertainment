import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class it22149 {
    static Scanner input = new Scanner(System.in);        //αρχικοποίηση scanner
    public static int intChecker(String msgForUser){ //exception handing σε ακέραιους
        boolean loop = true;
        int x = 0;
        while (loop) {
            try {
                System.out.print(msgForUser);
                x = input.nextInt();
                loop = false;
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Μπορείς να εισάγεις μόνο αριθμό.Ξαναδοκίμασε");
                input.nextLine();
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Random random = new Random(); //αρχικοποίηση random για τα id
        int MenuChoice; //αρχικοποίηση διαφόρων μεταβλητών κυρίως για το input του χρήστη
        int ShowType;
        String title;
        String genre;
        String directorName;
        String countryOfOrigin;
        String dateOfBirth;
        String countryOfBirth;
        boolean directorFound;
        String websiteCheck;
        String website;
        int actorCounter;
        String newActor;
        int seasonNumber;
        int episodesNumber;
        String lastYearSeason;
        int userChoice;
        boolean actorFound;
        int id;
        int size;
        String username;
        String email;
        String password;
        int rating;
        int releaseYear;
        int genresCount;
        ArrayList<Show> showList = new ArrayList<>();       //απο γραμμή 52 μέχρι 204 βάζουμε καρφωτά στο πρόγραμμα 4 ταινίες και 3 σειρές
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<UserCredentials> userList = new ArrayList<>();
        ArrayList<String> johnWickGenres = new ArrayList<>();
        ArrayList<Person> johnWickPerson = new ArrayList<>();
        Person ChadStahelski = new Person("Chad Stahelski", "20/9/1968", "USA", "-", random.nextInt(899999)+100000);
        Person LaurenceFishburne = new Person("Laurence Fishburne", "30/7/1961", "USA", "-", random.nextInt(899999)+100000);
        Person KeanuReeves = new Person("Keanu Reeves", "2/9/1964", "USA", "-", random.nextInt(899999)+100000);
        Person LanceReddick = new Person("Lance Reddick", "7/6/1962", "USA", "-", random.nextInt(899999)+100000);
        johnWickPerson.add(LanceReddick);
        johnWickPerson.add(LaurenceFishburne);
        johnWickPerson.add(KeanuReeves);
        personList.add(KeanuReeves);
        personList.add(LanceReddick);
        personList.add(LaurenceFishburne);
        personList.add(ChadStahelski);
        johnWickGenres.add("Action");
        johnWickGenres.add("Adventure");
        johnWickGenres.add("Drama");
        Show johnWick4 = new Show("John Wick 4", 2023, johnWickGenres, "USA", "Chad Stahelski", johnWickPerson, random.nextInt(899999)+100000);
        showList.add(johnWick4);
        ArrayList<String> batmanGenres = new ArrayList<>();
        ArrayList<Person> batmanPerson = new ArrayList<>();
        Person MattReeves = new Person("Matt Reeves", "27/4/1966", "USA", "-", random.nextInt(899999)+100000);
        Person RobertPattinson = new Person("Robert Pattinson", "13/5/1986", "England", "-", random.nextInt(899999)+100000);
        Person ZoeKravitz = new Person("Zoe Kravitz", "1/12/1988", "USA", "-", random.nextInt(899999)+100000);
        Person JeffreyWright = new Person("Jeffrey Wright", "7/12/1965", "USA", "-", random.nextInt(899999)+100000);
        batmanPerson.add(RobertPattinson);
        batmanPerson.add(ZoeKravitz);
        batmanPerson.add(JeffreyWright);
        personList.add(RobertPattinson);
        personList.add(ZoeKravitz);
        personList.add(JeffreyWright);
        personList.add(MattReeves);
        johnWickGenres.add("Action");
        johnWickGenres.add("Crime");
        johnWickGenres.add("Drama");
        Show batman = new Show("The Batman", 2022, batmanGenres, "USA", "Matt Reeves", batmanPerson, random.nextInt(899999)+100000);
        showList.add(batman);
        ArrayList<String> jokerGenres = new ArrayList<>();
        ArrayList<Person> jokerPerson = new ArrayList<>();
        Person ToddPhillips = new Person("Todd Phillips", "20/12/1970", "USA", "-", random.nextInt(899999)+100000);
        Person JoaquinPhoenix = new Person("Joaquin Phoenix", "28/10/1974", "Puerto Rico", "-", random.nextInt(899999)+100000);
        Person RobertDeNiro = new Person("Robert De Niro", "17/6/1943", "USA", "-", random.nextInt(899999)+100000);
        Person ZazieBeetz = new Person("Zazie Beetz", "1/6/1991", "German", "-", random.nextInt(899999)+100000);
        jokerPerson.add(JoaquinPhoenix);
        jokerPerson.add(RobertDeNiro);
        jokerPerson.add(ZazieBeetz);
        personList.add(ToddPhillips);
        personList.add(JoaquinPhoenix);
        personList.add(RobertDeNiro);
        personList.add(ZazieBeetz);
        jokerGenres.add("Thriller");
        jokerGenres.add("Crime");
        jokerGenres.add("Drama");
        Show joker = new Show("Joker", 2019, jokerGenres, "USA", "Todd Phillips", jokerPerson, random.nextInt(899999)+100000);
        showList.add(joker);
        ArrayList<String> avatarGenres = new ArrayList<>();
        ArrayList<Person> avatarPerson = new ArrayList<>();
        Person JamesCameron = new Person("James Cameron", "16/6/1954", "USA", "-", random.nextInt(899999)+100000);
        Person SamWorthington = new Person("Sam Worthington", "2/6/1976", "England", "-", random.nextInt(899999)+100000);
        Person ZoeSaldana = new Person("Zoe Saldana", "19/6/1978", "USA", "-", random.nextInt(899999)+100000);
        Person SigourneyWeaver = new Person("Sigourney Weaver", "8/10/1949", "USA", "-", random.nextInt(899999)+100000);
        avatarPerson.add(SamWorthington);
        avatarPerson.add(ZoeSaldana);
        avatarPerson.add(SigourneyWeaver);
        personList.add(JamesCameron);
        personList.add(SamWorthington);
        personList.add(ZoeSaldana);
        personList.add(SigourneyWeaver);
        avatarGenres.add("Fantasy");
        avatarGenres.add("Action");
        avatarGenres.add("Adventure");
        Show avatar = new Show("Avatar: The Way of Water", 2022, avatarGenres, "USA", "James Cameron", avatarPerson, random.nextInt(899999)+100000);
        showList.add(avatar);
        ArrayList<String> breakingBadGenres = new ArrayList<>();
        ArrayList<Person> breakingBadPerson = new ArrayList<>();
        ArrayList<Integer> breakingBadEpisodes = new ArrayList<>();
        Person VinceGilligan = new Person("Vince Gilligan", "10/2/1967", "USA", "-", random.nextInt(899999)+100000);
        Person BryanCranston = new Person("Bryan Cranston", "7/3/1956", "USA", "-", random.nextInt(899999)+100000);
        Person AaronPaul = new Person("Aaron Paul", "27/6/1979", "USA", "-", random.nextInt(899999)+100000);
        Person AnnaGunn = new Person("Anna Gunn", "11/6/1968", "USA", "-", random.nextInt(899999)+100000);
        breakingBadPerson.add(BryanCranston);
        breakingBadPerson.add(AaronPaul);
        breakingBadPerson.add(AnnaGunn);
        personList.add(VinceGilligan);
        personList.add(BryanCranston);
        personList.add(AaronPaul);
        personList.add(AnnaGunn);
        breakingBadGenres.add("Crime");
        breakingBadGenres.add("Drama");
        breakingBadGenres.add("Thriller");
        breakingBadEpisodes.add(7);
        breakingBadEpisodes.add(13);
        breakingBadEpisodes.add(13);
        breakingBadEpisodes.add(13);
        breakingBadEpisodes.add(16);
        Series breakingBad = new Series("Breaking Bad", 2008, breakingBadGenres, "USA", "Vince Gilligan", breakingBadPerson, random.nextInt(899999)+100000, 5, "2013", breakingBadEpisodes);
        showList.add(breakingBad);
        ArrayList<String> prisonBreakGenres = new ArrayList<>();
        ArrayList<Person> prisonBreakPerson = new ArrayList<>();
        ArrayList<Integer> prisonBreakEpisodes = new ArrayList<>();
        Person PaulTScheuring = new Person("Paul T. Scheuring", "20/11/1968", "USA", "-", random.nextInt(899999)+100000);
        Person WentworthMiller = new Person("Wentworth Miller", "2/6/1972", "USA", "-", random.nextInt(899999)+100000);
        Person DominicPurcell = new Person("Dominic Purcell", "17/2/1970", "USA", "-", random.nextInt(899999)+100000);
        Person AmauryNolasco = new Person("Amaury Nolasco", "24/12/1970", "Puerto Rico", "-", random.nextInt(899999)+100000);
        prisonBreakPerson.add(WentworthMiller);
        prisonBreakPerson.add(DominicPurcell);
        prisonBreakPerson.add(AmauryNolasco);
        personList.add(PaulTScheuring);
        personList.add(WentworthMiller);
        personList.add(DominicPurcell);
        personList.add(AmauryNolasco);
        prisonBreakGenres.add("Action");
        prisonBreakGenres.add("Crime");
        prisonBreakGenres.add("Drama");
        prisonBreakEpisodes.add(22);
        prisonBreakEpisodes.add(22);
        prisonBreakEpisodes.add(13);
        prisonBreakEpisodes.add(24);
        prisonBreakEpisodes.add(9);
        Series prisonBreak = new Series("Prison Break", 2005, prisonBreakGenres, "USA", "Paul T. Scheuring", prisonBreakPerson, random.nextInt(899999)+100000, 5, "2017", prisonBreakEpisodes);
        showList.add(prisonBreak);
        ArrayList<String> theWalkingDeadGenres = new ArrayList<>();
        ArrayList<Person> theWalkingDeadPerson = new ArrayList<>();
        ArrayList<Integer> theWalkingDeadEpisodes = new ArrayList<>();
        Person FrankDarabont = new Person("Frank Darabont", "28/1/1959", "France", "-", random.nextInt(899999)+100000);
        Person AndrewLincoln = new Person("Andrew Lincoln", "14/7/1973", "England", "-", random.nextInt(899999)+100000);
        Person NormanReedus = new Person("Norman Reedus", "6/1/1969", "USA", "-", random.nextInt(899999)+100000);
        Person MelissaMcBride = new Person("Melissa McBride", "23/5/1965", "USA", "-", random.nextInt(899999)+100000);
        theWalkingDeadPerson.add(AndrewLincoln);
        theWalkingDeadPerson.add(NormanReedus);
        theWalkingDeadPerson.add(MelissaMcBride);
        personList.add(FrankDarabont);
        personList.add(AndrewLincoln);
        personList.add(NormanReedus);
        personList.add(MelissaMcBride);
        theWalkingDeadGenres.add("Drama");
        theWalkingDeadGenres.add("Horror");
        theWalkingDeadGenres.add("Thriller");
        theWalkingDeadEpisodes.add(6);
        theWalkingDeadEpisodes.add(13);
        theWalkingDeadEpisodes.add(16);
        theWalkingDeadEpisodes.add(16);
        theWalkingDeadEpisodes.add(16);
        theWalkingDeadEpisodes.add(16);
        theWalkingDeadEpisodes.add(16);
        theWalkingDeadEpisodes.add(16);
        theWalkingDeadEpisodes.add(16);
        theWalkingDeadEpisodes.add(22);
        theWalkingDeadEpisodes.add(24);
        Series theWalkingDead = new Series("The Walking Dead", 2010, theWalkingDeadGenres, "USA", "Frank Darabont", theWalkingDeadPerson, random.nextInt(899999)+100000, 11, "2022", theWalkingDeadEpisodes);
        showList.add(theWalkingDead);
        System.out.println("Καλωσορίσατε στην JavaEntertainment.Μία εφαρμογή για την πληροφόρηση και διαχείριση θεαμάτων.");
        do {
            MenuChoice = intChecker("Επιλέξτε μία απο τις 5 διαθέσιμες επιλογές\n1:Καταχώρηση θεάματος\n2:Ανανέωση θεάματος\n3:Αναζήτηση πληροφοριών και Αξιολόγηση\n4:Αναζήτηση πληροφοριών και Αγαπημένος ηθοποιός/σκηνοθέτης\n5:Έξοδος απο την εφαρμογή\n");
            while ((MenuChoice < 1) || (MenuChoice > 5)) {   //έλεγχος στην επιλογή του χρήστη για το menu
                System.out.println("Αυτή η επιλογή δεν υπάρχει.Παρακαλώ επιλέξτε μία απο τις παρακάτω διαθέσιμες επιλογές:");
                MenuChoice = intChecker("1:Καταχώρηση θεάματος\n2:Ανανέωση θεάματος\n3:Αναζήτηση πληροφοριών και Αξιολόγηση\n4:Αναζήτηση πληροφοριών και Αγαπημένος ηθοποιός/σκηνοθέτης\n5:Έξοδος απο την εφαρμογή\n");
            }
            if (MenuChoice == 1) {
                ShowType = intChecker("Θέλετε να καταχωρήσετε Ταινία(1) η Σειρά(2)?\n");
                while ((ShowType != 1) && (ShowType != 2)) {
                    ShowType = intChecker("Αυτή η επιλογή δεν υπάρχει.Θέλετε να καταχωρήσετε Ταινία(1) η Σειρά(2)?\n");
                }
                if (ShowType == 1) {
                    Show show = new Show(); //δημιουργία νέας ταινίας(show object)
                    show.setShowId(random.nextInt(899999) + 100000);
                    System.out.println("Εισάγετε τον τίτλο της ταινίας");
                    title = input.nextLine();
                    show.setShowTitle(title);
                    releaseYear = intChecker("Εισάγετε το έτος 1ης προβολής της ταινίας\n");
                    show.setShowReleaseYear(releaseYear);
                    ArrayList<String> movieGenres = new ArrayList<>();
                    System.out.println("Εισάγετε τον/τους τύπο/ους της ταινίας");
                    System.out.println("Οι διαθέσιμοι τύποι είναι οι εξής:");
                    System.out.println("Comedy\nCrime\nDrama\nHorror\nRomance\nThriller");
                    System.out.println("Όταν θα έχετε εισάγει όλες τις κατηγορίες στις οποίες ανήκει η ταινία γράψτε quit ");
                    genresCount = 0;
                    do { //εισαγωγή κατηγοριών ταινίας (μέχρι 3)!
                        System.out.println("Εισάγετε μια κατηγορία της ταινίας");
                        genre = input.nextLine();
                        genresCount++;
                        if (genre.equalsIgnoreCase("quit")) {
                            break;
                        } else if (genresCount == 3) {
                            System.out.println("Δεν μπορείς να εισάγεις πάνω απο 3 Genres");
                            break;
                        }
                        movieGenres.add(genre);
                    } while (true);
                    show.setShowGenres(movieGenres);
                    System.out.println("Εισάγετε τη χώρα παραγωγής της ταινίας");
                    countryOfOrigin = input.nextLine();
                    show.setShowCountryOfOrigin(countryOfOrigin);
                    System.out.println("Εισάγετε το ονοματεπώνυμο της/του σκηνοθέτριας/τη");
                    directorName = input.nextLine();
                    show.setShowDirectorName(directorName);
                    directorFound = false;
                    for (Person x : personList) { //έλεγχος ύπαρξης σκηνοθέτη
                        if (x.getPersonName().equalsIgnoreCase(directorName)) {
                            directorFound = true;
                            break;
                        }
                    }
                    if (!directorFound) { //αν δεν υπάρχει, προσθέτουμε τα νέα στοιχεία
                        Person person = new Person();
                        person.setPersonId(random.nextInt(899999) + 100000);
                        person.setPersonName(directorName);
                        System.out.println("Εισάγετε την ημερομηνία γέννησης της/του σκηνοθέτριας/τη (ΗΗ/ΜΜ/ΕΕ)");
                        dateOfBirth = input.nextLine();
                        person.setPersonBirthDate(dateOfBirth);
                        System.out.println("Εισάγετε την χώρα γέννησης της/του σκηνοθέτριας/τη");
                        countryOfBirth = input.nextLine();
                        person.setPersonBirthCountry(countryOfBirth);
                        System.out.println("Η/Ο σκηνοθέτρια/της έχει website? (yes/no)");
                        websiteCheck = input.nextLine();
                        while ((!websiteCheck.equalsIgnoreCase("yes")) && (!websiteCheck.equalsIgnoreCase("no"))) {
                            System.out.println("Αυτή η επιλογή δεν υπάρχει");
                            System.out.println("Γράψτε yes αμα η/ο σκηνοθέτρια/της έχει website, ή no άν δεν έχει");
                            websiteCheck = input.nextLine();
                        }
                        if (websiteCheck.equalsIgnoreCase("yes")) {
                            System.out.println("Εισάγετε το website");
                            website = input.nextLine();
                            person.setPersonWebsite(website);
                        } else {
                            person.setPersonWebsite("-");
                        }
                        personList.add(person);
                    }
                    System.out.println("Εισάγετε τις/τους ηθοποιούς της ταινίας (Μέχρι 10)\nΌταν θα έχετε εισάγει όλους τους ηθοποιούς γράψτε 'quit' για συνέχεια");
                    ArrayList<Person> showActors = new ArrayList<>();
                    actorCounter = 0;
                    do { //έλεγχος για το άμα υπάρχει ο ηθοποιός στο σύστημα, μέχρι 10 σε κάθε ταινία
                        System.out.println("Εισάγετε το όνομα του/της ηθοποιού");
                        newActor = input.nextLine();
                        if (newActor.equalsIgnoreCase("quit")) {
                            break;
                        }
                        actorFound = false;
                        Person newActorObj = null;
                        for (Person x : personList) {
                            if (x.getPersonName().equalsIgnoreCase(newActor)) {
                                actorFound = true;
                                newActorObj = x;
                                break;
                            }
                        }
                        if (!actorFound) { //αν δεν υπάρχει τότε ζητάμε στοιχεία
                            Person person = new Person();
                            person.setPersonName(newActor);
                            person.setPersonId(random.nextInt(899999) + 100000);
                            System.out.println("Εισάγετε την ημερομηνία γέννησης της/του ηθοποιού (ΗΗ/ΜΜ/ΕΕ)");
                            dateOfBirth = input.nextLine();
                            person.setPersonBirthDate(dateOfBirth);
                            System.out.println("Εισάγετε την χώρα γέννησης της/του ηθοποιού");
                            countryOfBirth = input.nextLine();
                            person.setPersonBirthCountry(countryOfBirth);
                            System.out.println("Η/Ο ηθοποιός έχει website? (yes/no)");
                            websiteCheck = input.nextLine();
                            while ((!websiteCheck.equalsIgnoreCase("yes")) && (!websiteCheck.equalsIgnoreCase("no"))) {
                                System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                System.out.println("Γράψτε yes αμα η/ο ηθοποιός έχει website, ή no άν δεν έχει");
                                websiteCheck = input.nextLine();
                            }
                            if (websiteCheck.equalsIgnoreCase("yes")) {
                                System.out.println("Εισάγετε το website");
                                website = input.nextLine();
                                person.setPersonWebsite(website);
                            } else {
                                person.setPersonWebsite("-");
                            }
                            personList.add(person);
                            showActors.add(person);
                        } else {
                            showActors.add(newActorObj);
                        }
                        actorCounter++;
                    } while (actorCounter <= 10);
                    if (actorCounter == 10) {
                        System.out.println("Δεν μπορείς να προσθέσεις πάνω απο 10 ηθοποιούς");
                    }
                    show.setShowActors(showActors);
                    System.out.println(show.toString());
                    showList.add(show);
                } else {
                    Series series = new Series(); //δημιουργία νέας σειράς(series object)
                    series.setShowId(random.nextInt(899999) + 100000);
                    System.out.println("Εισάγετε τον τίτλο της σειράς");
                    title = input.nextLine();
                    series.setShowTitle(title);
                    releaseYear = intChecker("Εισάγετε το έτος πρεμιέρας της σειράς\n");
                    series.setShowReleaseYear(releaseYear);
                    ArrayList<String> seriesGenres = new ArrayList<>();
                    System.out.println("Εισάγετε τον/τους τύπο/ους της σειράς");
                    System.out.println("Οι διαθέσιμοι τύποι είναι οι εξής:");
                    System.out.println("Comedy\nCrime\nDrama\nHorror\nRomance\nThriller");
                    System.out.println("Όταν θα έχετε εισάγει όλες τις κατηγορίες στις οποίες ανήκει η σειρά γράψτε 'quit' ");
                    genresCount = 0;
                    do {        //εισαγωγή κατηγοριών σειράς (μέχρι 3)!
                        System.out.println("Εισάγετε μια κατηγορία της ταινίας");
                        genre = input.nextLine();
                        genresCount++;
                        if (genre.equalsIgnoreCase("quit")) {
                            break;
                        } else if (genresCount == 3) {
                            System.out.println("Δεν μπορείς να εισάγεις πάνω απο 3 Genres");
                            break;
                        }
                        seriesGenres.add(genre);
                    } while (true);
                    series.setShowGenres(seriesGenres);
                    System.out.println("Εισάγετε τη χώρα παραγωγής της σειράς");
                    countryOfOrigin = input.nextLine();
                    series.setShowCountryOfOrigin(countryOfOrigin);
                    System.out.println("Εισάγετε το ονοματεπώνυμο της/του σκηνοθέτριας/τη");
                    directorName = input.nextLine();
                    series.setShowDirectorName(directorName);
                    directorFound = false;
                    for (Person x : personList) {    //έλεγχος ύπαρξης σκηνοθέτη
                        if (x.getPersonName().equalsIgnoreCase(directorName)) {
                            directorFound = true;
                            break;
                        }
                    }
                    if (!directorFound) { //αν δεν υπάρχει, προσθέτουμε τα νέα στοιχεία
                        Person person = new Person();
                        person.setPersonId(random.nextInt(899999) + 100000);
                        person.setPersonName(directorName);
                        System.out.println("Εισάγετε την ημερομηνία γέννησης της/του σκηνοθέτριας/τη (ΗΗ/ΜΜ/ΕΕ)");
                        dateOfBirth = input.nextLine();
                        person.setPersonBirthDate(dateOfBirth);
                        System.out.println("Εισάγετε την χώρα γέννησης της/του σκηνοθέτριας/τη");
                        countryOfBirth = input.nextLine();
                        person.setPersonBirthCountry(countryOfBirth);
                        System.out.println("Η/Ο σκηνοθέτρια/της έχει website? (yes/no)");
                        websiteCheck = input.nextLine();
                        while ((!websiteCheck.equalsIgnoreCase("yes")) && (!websiteCheck.equalsIgnoreCase("no"))) {
                            System.out.println("Αυτή η επιλογή δεν υπάρχει");
                            System.out.println("Γράψτε yes αμα η/ο σκηνοθέτρια/της έχει website, ή no άν δεν έχει");
                            websiteCheck = input.nextLine();
                        }
                        if (websiteCheck.equalsIgnoreCase("yes")) {
                            System.out.println("Εισάγετε το website");
                            website = input.nextLine();
                            person.setPersonWebsite(website);
                        } else {
                            person.setPersonWebsite("-");
                        }
                        personList.add(person);
                    }
                    System.out.println("Εισάγετε τις/τους ηθοποιούς της σειράς (Μέχρι 10)\nΌταν θα έχετε εισάγει όλους τους ηθοποιούς γράψτε 'quit' για συνέχεια");
                    ArrayList<Person> showActors = new ArrayList<>();
                    actorCounter = 0;
                    do {    //έλεγχος για το άμα υπάρχει ο ηθοποιός στο σύστημα, μέχρι 10 σε κάθε ταινία
                        System.out.println("Εισάγετε το όνομα του/της ηθοποιού");
                        newActor = input.nextLine();
                        if (newActor.equalsIgnoreCase("quit")) {
                            break;
                        }
                        actorFound = false;
                        Person newActorObj = null;
                        for (Person x : personList) {
                            if (x.getPersonName().equalsIgnoreCase(newActor)) {
                                actorFound = true;
                                newActorObj = x;
                                break;
                            }
                        }
                        if (!actorFound) { //αν δεν υπάρχει τον προσθέτουμε στο σύστημα
                            Person person = new Person();
                            person.setPersonName(newActor);
                            person.setPersonId(random.nextInt(899999) + 100000);
                            System.out.println("Εισάγετε την ημερομηνία γέννησης της/του ηθοποιού (ΗΗ/ΜΜ/ΕΕ)");
                            dateOfBirth = input.nextLine();
                            person.setPersonBirthDate(dateOfBirth);
                            System.out.println("Εισάγετε την χώρα γέννησης της/του ηθοποιού");
                            countryOfBirth = input.nextLine();
                            person.setPersonBirthCountry(countryOfBirth);
                            System.out.println("Η/Ο ηθοποιός έχει website? (yes/no)");
                            websiteCheck = input.nextLine();
                            while ((!websiteCheck.equalsIgnoreCase("yes")) && (!websiteCheck.equalsIgnoreCase("no"))) {
                                System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                System.out.println("Γράψτε yes αμα η/ο ηθοποιός έχει website, ή no άν δεν έχει");
                                websiteCheck = input.nextLine();
                            }
                            if (websiteCheck.equalsIgnoreCase("yes")) {
                                System.out.println("Εισάγετε το website");
                                website = input.nextLine();
                                person.setPersonWebsite(website);
                            } else {
                                person.setPersonWebsite("-");
                            }
                            personList.add(person);
                            showActors.add(person);
                        } else {
                            showActors.add(newActorObj);
                        }
                        actorCounter++;
                    } while ((actorCounter < 10) );
                    if (actorCounter == 10) {
                        System.out.println("Δεν μπορείς να προσθέσεις πάνω απο 10 ηθοποιούς");
                    }
                    series.setShowActors(showActors);
                    seasonNumber = intChecker("Εισάγετε το πλήθος σεζόν της σειράς\n"); //προσθέτουμε τα 3 extra στοιχεία που διαχωρίζουν τη σειρά απο την ταινία....
                    series.setNumberOfSeasons(seasonNumber);                                       //...πλήθος σεζόν, πλήθος επεισοδίων για κάθε σεζόν και έτος τελευταίας προβολής
                    ArrayList<Integer> episodeList = new ArrayList<>();
                    for (int i = 0; i < seasonNumber; i++) {
                        episodesNumber = intChecker("Δώσε το πλήθος επεισοδίων για την No " + (i+1) + " σεζόν\n");
                        episodeList.add(episodesNumber);
                    }
                    series.setEpisodes(episodeList);
                    System.out.println("Εισάγετε το έτος τελευταίας προβολής της σειράς (– αν παίζεται ακόμα)");
                    lastYearSeason = input.nextLine();
                    series.setLastSeasonYear(lastYearSeason);
                    System.out.println(series.toString());
                    showList.add(series);
                }
            }
            if (MenuChoice == 2) {
                userChoice = intChecker("Θέλεις να κάνεις αναζήτηση με βάση τον τίτλο (1) ή το μοναδικό κωδικό ταυτοποίησης(2)\n");
                while ((userChoice != 1) && (userChoice != 2)) {
                    System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                    userChoice = intChecker("Θέλεις να κάνεις αναζήτηση με βάση τον τίτλο (1) ή το μοναδικό κωδικό ταυτοποίησης(2)\n");
                }
                if (userChoice == 1) { //αναζήτηση σειράς με βάση τον τίτλο
                    System.out.println("Εισάγετε τον τίτλο της σειράς για αλλαγή στοιχείων");
                    title = input.nextLine();
                    Series seriesFound = null;
                    for (Show x : showList) { //έλεγχος για το άμα υπάρχει η σειρά
                        if (x instanceof Series) {
                            if (x.getShowTitle().equalsIgnoreCase(title)) {
                                seriesFound = (Series) x;
                                break;
                            }
                        }
                    }
                    if (seriesFound == null) {
                        System.out.println("Δεν υπάρχει κάποια σειρά με αυτόν τον τίτλο");
                    } else { //αν υπάρχει η σειρά τότε μπορούμε να αλλάξουμε χαρακτηριστικά της
                        userChoice = intChecker("θέλετε να αλλάξετε το πλήθος σεζόν (1) , το πλήθος επεισοδίων για οποιαδήποτε σεζόν (2) ή το έτος τελευταίας προβολής (3)\n");
                        while ((userChoice != 1) && (userChoice != 2) && (userChoice != 3)) {
                            System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                            userChoice = intChecker("θέλετε να αλλάξετε το πλήθος σεζόν (1) , το πλήθος επεισοδίων για οποιαδήποτε σεζόν (2) ή το έτος τελευταίας προβολής (3)\n");
                        }
                        if (userChoice == 1) {
                            seasonNumber = intChecker("Εισάγεται το νέο πλήθος σεζόν για την σειρά\n");
                            seriesFound.setNumberOfSeasons(seasonNumber);
                        }
                        if (userChoice == 2) {
                            ArrayList<Integer> newEpisodes;
                            seasonNumber = intChecker("Για ποία σεζόν θέλετε να αλλάξετε το πλήθος των επεισοδίων?\n");
                            episodesNumber = intChecker("Εισάγετε το νέο πλήθος των επεισοδίων για την σεζόν No:" + seasonNumber + "\n");
                            newEpisodes = seriesFound.getEpisodes();
                            newEpisodes.set(seasonNumber-1, episodesNumber);
                            seriesFound.setEpisodes(newEpisodes);
                        }
                        if (userChoice == 3) {
                            System.out.println("Εισάγεται το νέο έτος τελευταίας προβολής");
                            lastYearSeason = input.nextLine();
                            seriesFound.setLastSeasonYear(lastYearSeason);
                        }
                        System.out.println("Θέλεις να προσθέσεις νέους ηθοποιούς στη σειρά?(yes/no)");
                        newActor = input.nextLine();
                        while ((!newActor.equalsIgnoreCase("yes")) && (!newActor.equalsIgnoreCase("no"))) {
                            System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                            System.out.println("yes αμα θέλεις να προσθέσεις νέους ηθοποιούς ή no για συνέχεια");
                            newActor = input.nextLine();
                        }
                        size = (seriesFound.getShowActors().size())+1;
                        if (size >= 10) {
                            System.out.println("Δεν μπορείς να προσθέσεις περισσότερους απο 10 ηθοποιούς");
                        } else { //προσθήκη νέων ηθοποιών εφόσον είναι λιγότεροι απο 10.
                            if (newActor.equalsIgnoreCase("yes")) {
                                do {
                                    System.out.println("Εισάγετε το όνομα του/της ηθοποιού (quit αν θέλεις να βγεις)");
                                    newActor = input.nextLine();
                                    if (newActor.equalsIgnoreCase("quit")) {
                                        break;
                                    }
                                    actorFound = false;
                                    Person personFound = null;
                                    for (Person y : personList) {
                                        if (y.getPersonName().equalsIgnoreCase(newActor)) {
                                            actorFound = true;
                                            personFound = y;
                                            break;
                                        }
                                    }
                                    if (actorFound) {
                                        ArrayList<Person> newActorList = new ArrayList<>();
                                        newActorList = seriesFound.getShowActors();
                                        newActorList.add(personFound);
                                        seriesFound.setShowActors(newActorList);
                                    } else {
                                        Person person = new Person();
                                        person.setPersonName(newActor);
                                        person.setPersonId(random.nextInt(899999) + 100000);
                                        System.out.println("Εισάγετε την ημερομηνία γέννησης της/του ηθοποιού (ΗΗ/ΜΜ/ΕΕ)");
                                        dateOfBirth = input.nextLine();
                                        person.setPersonBirthDate(dateOfBirth);
                                        System.out.println("Εισάγετε την χώρα γέννησης της/του ηθοποιού");
                                        countryOfBirth = input.nextLine();
                                        person.setPersonBirthCountry(countryOfBirth);
                                        System.out.println("Η/Ο ηθοποιός έχει website? (yes/no)");
                                        websiteCheck = input.nextLine();
                                        while ((!websiteCheck.equalsIgnoreCase("yes")) && (!websiteCheck.equalsIgnoreCase("no"))) {
                                            System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                            System.out.println("Γράψτε yes αμα η/ο ηθοποιός έχει website, ή no άν δεν έχει");
                                            websiteCheck = input.nextLine();
                                        }
                                        if (websiteCheck.equalsIgnoreCase("yes")) {
                                            System.out.println("Εισάγετε το website");
                                            website = input.nextLine();
                                            person.setPersonWebsite(website);
                                        } else {
                                            person.setPersonWebsite("-");
                                        }
                                        personList.add(person);
                                        ArrayList<Person> newActorList = new ArrayList<>();
                                        newActorList = seriesFound.getShowActors();
                                        newActorList.add(person);
                                        seriesFound.setShowActors(newActorList);
                                    }
                                    size++;
                                } while (size < 10);
                                if (size == 10) {
                                    System.out.println("Δεν μπορείς να προσθέσεις πάνω απο 10 ηθοποιούς");
                                }
                            }
                        }
                    }
                } else { //αναζήτηση σειράς με βάση τον μοναδικό κωδικό ταυτοποίησης της σειράς
                    id = intChecker("Εισάγετε το μοναδικό κωδικό ταυτοποίησης της σειράς για αλλαγή στοιχείων\n");
                    Series seriesFound = null;
                    for (Show x : showList) {
                        if (x instanceof Series) { //έλεγχο για το άμα υπάρχει η σειρά με το id
                            if (x.getShowId() == id) {
                                seriesFound = (Series) x;
                                break;
                            }
                        }
                    }
                    if (seriesFound == null) {
                        System.out.println("Δεν υπάρχει κάποια σειρά με αυτόν το id");
                    } else {  //αν υπάρχει η σειρά τότε μπορούμε να αλλάξουμε χαρακτηριστικά της
                        userChoice = intChecker("θέλετε να αλλάξετε το πλήθος σεζόν (1) , το πλήθος επεισοδίων για οποιαδήποτε σεζόν (2) ή το έτος τελευταίας προβολής (3)\n");
                        while ((userChoice != 1) && (userChoice != 2) && (userChoice != 3)) {
                            System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                            userChoice = intChecker("θέλετε να αλλάξετε το πλήθος σεζόν (1) , το πλήθος επεισοδίων για οποιαδήποτε σεζόν (2) ή το έτος τελευταίας προβολής (3)\n");
                        }
                        if (userChoice == 1) {
                            seasonNumber = intChecker("Εισάγεται το νέο πλήθος σεζόν για την σειρά");
                            seriesFound.setNumberOfSeasons(seasonNumber);
                        }
                        if (userChoice == 2) {
                            ArrayList<Integer> newEpisodes = new ArrayList<>();
                            seasonNumber = intChecker("Για ποία σεζόν θέλετε να αλλάξετε το πλήθος των επεισοδίων?");
                            episodesNumber = intChecker("Εισάγετε το νέο πλήθος των επεισοδίων για την σεζόν No: " + seasonNumber + "\n");
                            newEpisodes = seriesFound.getEpisodes();
                            newEpisodes.set(seasonNumber-1, episodesNumber);
                            seriesFound.setEpisodes(newEpisodes);
                        }
                        if (userChoice == 3) {
                            System.out.println("Εισάγεται το νέο έτος τελευταίας προβολής");
                            lastYearSeason = input.nextLine();
                            seriesFound.setLastSeasonYear(lastYearSeason);
                        }
                        System.out.println("Θέλεις να προσθέσεις νέους ηθοποιούς στη σειρά?(yes/no)");
                        newActor = input.nextLine();
                        while ((!newActor.equalsIgnoreCase("yes")) && (!newActor.equalsIgnoreCase("no"))) {
                            System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                            System.out.println("yes αμα θέλεις να προσθέσεις νέους ηθοποιούς ή no για συνέχεια");
                            newActor = input.nextLine();
                        }
                        size = seriesFound.getShowActors().size();
                        if (size >= 10) {
                            System.out.println("Δεν μπορείς να προσθέσεις περισσότερους απο 10 ηθοποιούς");
                        } else { //προσθήκη νέων ηθοποιών εφόσον είναι λιγότεροι απο 10.
                            if (newActor.equalsIgnoreCase("yes")) {
                                do {
                                    System.out.println("Εισάγετε το όνομα του/της ηθοποιού (quit αν θέλεις να βγεις)");
                                    newActor = input.nextLine();
                                    if (newActor.equalsIgnoreCase("quit")) {
                                        break;
                                    }
                                    actorFound = false;
                                    Person personFound = null;
                                    for (Person y : personList) {
                                        if (y.getPersonName().equalsIgnoreCase(newActor)) {
                                            actorFound = true;
                                            personFound = y;
                                            break;
                                        }
                                    }
                                    if (actorFound) {
                                        ArrayList<Person> newActorList = new ArrayList<>();
                                        newActorList = seriesFound.getShowActors();
                                        newActorList.add(personFound);
                                        seriesFound.setShowActors(newActorList);
                                    } else {
                                        Person person = new Person();
                                        person.setPersonName(newActor);
                                        person.setPersonId(random.nextInt(899999) + 100000);
                                        System.out.println("Εισάγετε την ημερομηνία γέννησης της/του ηθοποιού (ΗΗ/ΜΜ/ΕΕ)");
                                        dateOfBirth = input.nextLine();
                                        person.setPersonBirthDate(dateOfBirth);
                                        System.out.println("Εισάγετε την χώρα γέννησης της/του ηθοποιού");
                                        countryOfBirth = input.nextLine();
                                        person.setPersonBirthCountry(countryOfBirth);
                                        System.out.println("Η/Ο ηθοποιός έχει website? (yes/no)");
                                        websiteCheck = input.nextLine();
                                        while ((!websiteCheck.equalsIgnoreCase("yes")) && (!websiteCheck.equalsIgnoreCase("no"))) {
                                            System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                            System.out.println("Γράψτε yes αμα η/ο ηθοποιός έχει website, ή no άν δεν έχει");
                                            websiteCheck = input.nextLine();
                                        }
                                        if (websiteCheck.equalsIgnoreCase("yes")) {
                                            System.out.println("Εισάγετε το website");
                                            website = input.nextLine();
                                            person.setPersonWebsite(website);
                                        } else {
                                            person.setPersonWebsite("-");
                                        }
                                        personList.add(person);
                                        ArrayList<Person> newActorList = new ArrayList<>();
                                        newActorList = seriesFound.getShowActors();
                                        newActorList.add(person);
                                        seriesFound.setShowActors(newActorList);
                                    }
                                    size++;
                                } while (size < 10);
                                if (size == 10) {
                                    System.out.println("Δεν μπορείς να προσθέσεις πάνω απο 10 ηθοποιούς");
                                }
                            }
                        }
                    }
                }
            }
            if (MenuChoice == 3) {
                userChoice = intChecker("Θέλετε να κάνετε αναζήτηση θεάματος με τον τίτλο(1) ή το έτος 1ης προβολής(2)\n");
                while ((userChoice != 1) && (userChoice != 2)) {
                    System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                    userChoice = intChecker("Θέλετε να κάνετε αναζήτηση θεάματος με τον τίτλο(1) ή το έτος 1ης προβολής(2)\n");
                }
                if (userChoice == 1) {
                    System.out.println("Εισάγετε τον τίτλο του θεάματος για εμφάνιση στοιχείων θεάματος και πιθανή αξιολόγηση");
                    title = input.nextLine();
                    Series seriesFound = null;
                    Show movieFound = null;
                    for (Show x : showList) {
                        if (x.getShowTitle().equalsIgnoreCase(title)) {  //έλεγχος για το άμα υπάρχει η σειρά με βάση τον τίτλο για εμφάνιση στοιχείων και...
                            if (x instanceof Series) {                   //...πιθανή αξιολόγηση με login και register
                                seriesFound = (Series) x;
                                System.out.println("Series id: " + x.getShowId());
                                System.out.println("Title: " + x.getShowTitle());
                                System.out.println("Release Year: " + x.getShowReleaseYear());
                                System.out.println("Show Genres: " + x.getShowGenres());
                                System.out.println("Director Name: " + x.getShowDirectorName());
                                if (((Series) x).getLastSeasonYear().equals("2023")) {
                                    System.out.println("Last Season Year: -");
                                }
                                System.out.println("Number of Seasons: " + ((Series) x).getNumberOfSeasons());
                                userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                while ((userChoice != 1) && (userChoice != 2) && (userChoice != 3)) {
                                    System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                    userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                }
                                if (userChoice == 1) {
                                    userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    while ((userChoice != 1) && (userChoice != 2)) {
                                        System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                        userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    }
                                    if (userChoice == 1) { //login για αξιολόγηση
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        boolean flag = false;
                                        for (UserCredentials y : userList) {
                                            if (y.getEmail().equals(email)) {
                                                flag = true;
                                                System.out.println("Δώσε το password");
                                                password = input.nextLine();
                                                if (y.getPassword().equals(password)) {
                                                    rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    while ((rating < 1) && (rating > 10)) {
                                                        System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                                        rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    }
                                                    ArrayList<Show> userReviewedShows = new ArrayList<>();
                                                    ArrayList<Integer> userRatingShows = new ArrayList<>();
                                                    if (!y.getReviewedShows().isEmpty()) {
                                                        userReviewedShows = y.getReviewedShows();
                                                        userRatingShows = y.getRatingShows();
                                                    }
                                                    userReviewedShows.add(seriesFound);
                                                    y.setReviewedShows(userReviewedShows);
                                                    userRatingShows.add(rating);
                                                    y.setRatingShows(userRatingShows);
                                                    System.out.println("Το θέαμα: " + seriesFound.getShowTitle() + " αξιολογήθηκε επιτυχώς");
                                                } else {
                                                    System.out.println("Ο κωδικός είναι λάθος");
                                                }
                                            }
                                        }
                                        if (!flag) {
                                            System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                        }
                                    } else {
                                        UserCredentials newUser = new UserCredentials(); //register
                                        System.out.println("Register:");
                                        System.out.println("Δώσε το username");
                                        username = input.nextLine();
                                        newUser.setUsername(username);
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        newUser.setEmail(email);
                                        System.out.println("Δώσε το password");
                                        password = input.nextLine();
                                        newUser.setPassword(password);
                                        userList.add(newUser);
                                        System.out.println("Ο λογαριασμός δημιουργήθηκε επιτυχώς");
                                    }
                                } else if (userChoice == 2) { //εμφάνιση αξιολογήσεων για τη σειρά απο την αναζήτηση
                                        boolean showfound = false;
                                        for (UserCredentials z : userList) {
                                            for (int i = 0; i < z.getReviewedShows().size(); i++) {
                                                    if (z.getReviewedShows().get(i).getShowTitle().equals(seriesFound.getShowTitle())) {
                                                        System.out.println("Username: " + z.getUsername() + " Rating: " + z.getRatingShows().get(i));
                                                        showfound = true;
                                                    }
                                                }
                                            }
                                    if (!showfound) {
                                        System.out.println("Δεν υπάρχουν αξιολογήσεις για αυτό το θέαμα");
                                    }
                                } else { //εμφάνιση προσωπικών αξιολογήσεων για όλες τις σειρές
                                    System.out.println("Sign in:");
                                    System.out.println("Δώσε το email");
                                    email = input.nextLine();
                                    boolean flag = false;
                                    for (UserCredentials z : userList) {
                                        if (z.getEmail().equals(email)) {
                                            flag = true;
                                            System.out.println("Δώσε το password");
                                            password = input.nextLine();
                                            if (z.getPassword().equals(password)) {
                                                for (int i = 0; i < z.getReviewedShows().size(); i++) {
                                                    System.out.println("Title: " + z.getReviewedShows().get(i).getShowTitle() + " Review: " + z.getRatingShows().get(i));
                                                }
                                            } else {
                                                System.out.println("Ο κωδικός είναι λάθος");
                                            }
                                        }
                                    }
                                    if (!flag) {
                                        System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                    }
                                }
                            } else {            //έλεγχος για το άμα υπάρχει η ταινία με βάση τον τίτλο για εμφάνιση στοιχείων και...
                                movieFound = x;     //...πιθανή αξιολόγηση με login και register
                                System.out.println("Movie id: " + x.getShowId());
                                System.out.println("Title: " + x.getShowTitle());
                                System.out.println("Release Year: " + x.getShowReleaseYear());
                                System.out.println("Show Genres: " + x.getShowGenres());
                                System.out.println("Director Name: " + x.getShowDirectorName());
                                userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                while ((userChoice != 1) && (userChoice != 2) && (userChoice != 3)) {
                                    System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                    userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                }
                                if (userChoice == 1) { //login για αξιολόγηση
                                    userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    while ((userChoice != 1) && (userChoice != 2)) {
                                        System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                        userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    }
                                    if (userChoice == 1) {
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        boolean flag = false;
                                        for (UserCredentials w : userList) {
                                            if (w.getEmail().equals(email)) {
                                                flag = true;
                                                System.out.println("Δώσε το password");
                                                password = input.nextLine();
                                                if (w.getPassword().equals(password)) {
                                                    rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    while ((rating < 1) && (rating > 10)) {
                                                        System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                                        rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    }
                                                    ArrayList<Show> userReviewedShows = new ArrayList<>();
                                                    ArrayList<Integer> userRatingShows = new ArrayList<>();
                                                    if (!w.getReviewedShows().isEmpty()) {
                                                        userReviewedShows = w.getReviewedShows();
                                                        userRatingShows = w.getRatingShows();
                                                    }
                                                    userReviewedShows.add(movieFound);
                                                    w.setReviewedShows(userReviewedShows);
                                                    userRatingShows.add(rating);
                                                    w.setRatingShows(userRatingShows);
                                                    System.out.println("Το θέαμα: " + movieFound.getShowTitle() + " αξιολογήθηκε επιτυχώς");
                                                } else {
                                                    System.out.println("Ο κωδικός είναι λάθος");
                                                }
                                            }
                                        }
                                        if (!flag) {
                                            System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                        }
                                    } else {  //register
                                        UserCredentials newUser = new UserCredentials();
                                        System.out.println("Register:");
                                        System.out.println("Δώσε το username");
                                        username = input.nextLine();
                                        newUser.setUsername(username);
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        newUser.setEmail(email);
                                        System.out.println("Δώσε το password");
                                        password = input.nextLine();
                                        newUser.setPassword(password);
                                        userList.add(newUser);
                                        System.out.println("Ο λογαριασμός δημιουργήθηκε επιτυχώς");
                                    }
                                } else if (userChoice == 2) {   //εμφάνιση αξιολογήσεων για την ταινία απο την αναζήτηση
                                        boolean showfound = false;
                                        for (UserCredentials a : userList) {
                                            for (int i = 0; i < a.getReviewedShows().size(); i++) {
                                                if (a.getReviewedShows().get(i).getShowTitle().equals(movieFound.getShowTitle())) {
                                                    System.out.println("Username: " + a.getUsername() + " Rating: " + a.getRatingShows().get(i));
                                                    showfound = true;
                                                }
                                            }
                                        }
                                        if (!showfound) {
                                            System.out.println("Δεν υπάρχουν αξιολογήσεις για αυτό το θέαμα");
                                        }
                                } else {    //εμφάνιση προσωπικών αξιολογήσεων για όλες τις ταινίες
                                    System.out.println("Sign in:");
                                    System.out.println("Δώσε το email");
                                    email = input.nextLine();
                                    boolean flag = false;
                                    for (UserCredentials b : userList) {
                                        if (b.getEmail().equals(email)) {
                                            flag = true;
                                            System.out.println("Δώσε το password");
                                            password = input.nextLine();
                                            if (b.getPassword().equals(password)) {
                                                for (int i = 0; i < b.getReviewedShows().size(); i++) {
                                                    System.out.println("Title: " + b.getReviewedShows().get(i).getShowTitle() + " Review: " + b.getRatingShows().get(i));
                                                }
                                            } else {
                                                System.out.println("Ο κωδικός είναι λάθος");
                                            }
                                        }
                                    }
                                    if (!flag) {
                                        System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                    }
                                }
                            }
                        }
                    }
                    if (seriesFound == null && movieFound == null) {
                        System.out.println("Δεν υπάρχει θέαμα με αυτόν τον τίτλο");
                    }
                } else {
                    releaseYear = intChecker("Εισάγετε το το έτος 1ης προβολής της σειράς για εμφάνιση στοιχείων θεάματος και πιθανή αξιολόγηση\n");
                    Series seriesFound = null;          //έλεγχος για το άμα υπάρχει η σειρά με βάση το έτος πρώτης προβολής για εμφάνιση στοιχείων και...
                    Show movieFound = null;             //...πιθανή αξιολόγηση με login και register
                    for (Show x : showList) {
                        if (x.getShowReleaseYear() == releaseYear) {
                            if (x instanceof Series) {
                                seriesFound = (Series) x;
                                System.out.println("Series id: " + x.getShowId());
                                System.out.println("Title: " + x.getShowTitle());
                                System.out.println("Release Year: " + x.getShowReleaseYear());
                                System.out.println("Show Genres: " + x.getShowGenres());
                                System.out.println("Director Name: " + x.getShowDirectorName());
                                if (((Series) x).getLastSeasonYear().equals("2023")) {
                                    System.out.println("Last Season Year: -");
                                }
                                System.out.println("Number of Seasons: " + ((Series) x).getNumberOfSeasons());
                                userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                while ((userChoice != 1) && (userChoice != 2) && (userChoice != 3)) {
                                    System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                    userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                }
                                if (userChoice == 1) {
                                    userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    while ((userChoice != 1) && (userChoice != 2)) {
                                        System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                        userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    }
                                    if (userChoice == 1) {      //login για αξιολόγηση
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        boolean flag = false;
                                        for (UserCredentials c : userList) {
                                            if (c.getEmail().equals(email)) {
                                                flag = true;
                                                System.out.println("Δώσε το password");
                                                password = input.nextLine();
                                                if (c.getPassword().equals(password)) {
                                                    rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    while ((rating < 1) && (rating > 10)) {
                                                        System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                                        rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    }
                                                    ArrayList<Show> userReviewedShows = new ArrayList<>();
                                                    ArrayList<Integer> userRatingShows = new ArrayList<>();
                                                    if (!c.getReviewedShows().isEmpty()) {
                                                        userReviewedShows = c.getReviewedShows();
                                                        userRatingShows = c.getRatingShows();
                                                    }
                                                    userReviewedShows.add(seriesFound);
                                                    c.setReviewedShows(userReviewedShows);
                                                    userRatingShows.add(rating);
                                                    c.setRatingShows(userRatingShows);
                                                    System.out.println("Το θέαμα: " + seriesFound.getShowTitle() + " αξιολογήθηκε επιτυχώς");
                                                } else {
                                                    System.out.println("Ο κωδικός είναι λάθος");
                                                }
                                            }
                                        }
                                        if (!flag) {
                                            System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                        }
                                    } else {        //register
                                        UserCredentials newUser = new UserCredentials();
                                        System.out.println("Register:");
                                        System.out.println("Δώσε το username");
                                        username = input.nextLine();
                                        newUser.setUsername(username);
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        newUser.setEmail(email);
                                        System.out.println("Δώσε το password");
                                        password = input.nextLine();
                                        newUser.setPassword(password);
                                        userList.add(newUser);
                                        System.out.println("Ο λογαριασμός δημιουργήθηκε επιτυχώς");
                                    }
                                } else if (userChoice == 2) {       //εμφάνιση αξιολογήσεων για τη σειρά απο την αναζήτηση
                                    boolean showfound = false;
                                    for (UserCredentials d : userList) {
                                        for (int i = 0; i < d.getReviewedShows().size(); i++) {
                                            if (d.getReviewedShows().get(i).getShowReleaseYear() == seriesFound.getShowReleaseYear()) {
                                                System.out.println("Username: " + d.getUsername() + " Rating: " + d.getRatingShows().get(i));
                                                showfound = true;
                                            }
                                        }
                                    }
                                    if (!showfound) {
                                        System.out.println("Δεν υπάρχουν αξιολογήσεις για αυτό το θέαμα");
                                    }
                                } else {        //εμφάνιση προσωπικών αξιολογήσεων για όλες τις σειρές
                                    System.out.println("Sign in:");
                                    System.out.println("Δώσε το email");
                                    email = input.nextLine();
                                    boolean flag = false;
                                    for (UserCredentials e : userList) {
                                        if (e.getEmail().equals(email)) {
                                            flag = true;
                                            System.out.println("Δώσε το password");
                                            password = input.nextLine();
                                            if (e.getPassword().equals(password)) {
                                                for (int i = 0; i < e.getReviewedShows().size(); i++) {
                                                    System.out.println("Title: " + e.getReviewedShows().get(i).getShowTitle() + " Review: " + e.getRatingShows().get(i));
                                                }
                                            } else {
                                                System.out.println("Ο κωδικός είναι λάθος");
                                            }
                                        }
                                    }
                                    if (!flag) {
                                        System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                    }
                                }
                            } else {
                                movieFound = x;                                 //έλεγχος για το άμα υπάρχει η ταινία με βάση το έτος πρώτης προβολής για εμφάνιση στοιχείων και...
                                System.out.println("Movie id: " + x.getShowId());    //...πιθανή αξιολόγηση με login και register
                                System.out.println("Title: " + x.getShowTitle());
                                System.out.println("Release Year: " + x.getShowReleaseYear());
                                System.out.println("Show Genres: " + x.getShowGenres());
                                System.out.println("Director Name: " + x.getShowDirectorName());
                                userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                while ((userChoice != 1) && (userChoice != 2) && (userChoice != 3)) {
                                    System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                    userChoice = intChecker("Αξιολόγηση θεάματος και register(1)\nΕμφάνιση αξιολογήσεων για το θέαμα(2)\nΕμφάνιση προσωπικών αξιολογήσεων για όλα τα θεάματα(3)\n");
                                }
                                if (userChoice == 1) {
                                    userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    while ((userChoice != 1) && (userChoice != 2)) {
                                        System.out.println("Αυτή η επιλογή δεν υπάρχει.Επέλεξε μία απο τις διαθέσιμες επιλογές");
                                        userChoice = intChecker("Sign in για αξιολόγηση (1) ή register(2)\n");
                                    }
                                    if (userChoice == 1) {          //login για αξιολόγηση
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        boolean flag = false;
                                        for (UserCredentials f : userList) {
                                            if (f.getEmail().equals(email)) {
                                                flag = true;
                                                System.out.println("Δώσε το password");
                                                password = input.nextLine();
                                                if (f.getPassword().equals(password)) {
                                                    rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    while ((rating < 1) && (rating > 10)) {
                                                        System.out.println("Αυτή η επιλογή δεν υπάρχει");
                                                        rating = intChecker("Δώσε την αξιολόγηση (Απο 1-10)\n");
                                                    }
                                                    ArrayList<Show> userReviewedShows = new ArrayList<>();
                                                    ArrayList<Integer> userRatingShows = new ArrayList<>();
                                                    if (!f.getReviewedShows().isEmpty()) {
                                                        userReviewedShows = f.getReviewedShows();
                                                        userRatingShows = f.getRatingShows();
                                                    }
                                                    userReviewedShows.add(movieFound);
                                                    f.setReviewedShows(userReviewedShows);
                                                    userRatingShows.add(rating);
                                                    f.setRatingShows(userRatingShows);
                                                    System.out.println("Το θέαμα: " + movieFound.getShowTitle() + " αξιολογήθηκε επιτυχώς");
                                                } else {
                                                    System.out.println("Ο κωδικός είναι λάθος");
                                                }
                                            }
                                        }
                                        if (!flag) {
                                            System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                        }
                                    } else {            //register
                                        UserCredentials newUser = new UserCredentials();
                                        System.out.println("Register:");
                                        System.out.println("Δώσε το username");
                                        username = input.nextLine();
                                        newUser.setUsername(username);
                                        System.out.println("Δώσε το email");
                                        email = input.nextLine();
                                        newUser.setEmail(email);
                                        System.out.println("Δώσε το password");
                                        password = input.nextLine();
                                        newUser.setPassword(password);
                                        userList.add(newUser);
                                        System.out.println("Ο λογαριασμός δημιουργήθηκε επιτυχώς");
                                    }
                                } else if (userChoice == 2) {
                                    boolean showfound = false;
                                    for (UserCredentials g : userList) {
                                        for (int i = 0; i < g.getReviewedShows().size(); i++) {
                                            if (g.getReviewedShows().get(i).getShowReleaseYear() == movieFound.getShowReleaseYear()) {
                                                System.out.println("Username: " + g.getUsername() + " Rating: " + g.getRatingShows().get(i));
                                                showfound = true;
                                            }
                                        }
                                    }
                                    if (!showfound) {
                                        System.out.println("Δεν υπάρχουν αξιολογήσεις για αυτό το θέαμα");
                                    }
                                } else {
                                    System.out.println("Sign in:");         //εμφάνιση προσωπικών αξιολογήσεων για όλες τις σειρές
                                    System.out.println("Δώσε το email");
                                    email = input.nextLine();
                                    boolean flag = true;
                                    for (UserCredentials h : userList) {
                                        if (h.getEmail().equals(email)) {
                                            System.out.println("Δώσε το password");
                                            password = input.nextLine();
                                            if (h.getPassword().equals(password)) {
                                                for (int i = 0; i < h.getReviewedShows().size(); i++) {
                                                    System.out.println("Title: " + h.getReviewedShows().get(i).getShowTitle() + " Review: " + h.getRatingShows().get(i));
                                                }
                                            } else {
                                                System.out.println("Ο κωδικός είναι λάθος");
                                            }
                                        }
                                    }
                                    if (!flag) {
                                        System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                    }
                                }
                            }
                        }
                    }
                    if (seriesFound == null && movieFound == null) {
                        System.out.println("Δεν υπάρχει θέαμα με αυτό το έτος 1ης προβολής");
                    }
                }
            }
            if (MenuChoice == 4) {
                userChoice = intChecker("Αναζήτηση ηθοποιού/σκηνοθέτη και προσθήκη στους αγαπημένους(1) ή Εμφάνιση αγαπημένων ηθοποιών/σκηνοθετών(2)\n");
                while (userChoice != 1 && userChoice != 2 ) {
                    System.out.println("Αυτή η επιλογή δεν υπάρχει.Επίλεξε μία απο τις διαθέσιμες επιλογές");
                    userChoice = intChecker("Αναζήτηση ηθοποιού/σκηνοθέτη και προσθήκη στους αγαπημένους(1) ή Εμφάνιση αγαπημένων ηθοποιών/σκηνοθετών(2)\n");
                }
                if (userChoice == 1) { //αναζήτηση σκηνοθέτη/ηθοποιού
                    userChoice = intChecker("Επίλεξε (1) για αναζήτηση σκηνοθέτη, ή (2) για αναζήτηση ηθοποιού\n");
                    while (userChoice != 1 && userChoice!= 2) {
                        System.out.println("Αυτή η επιλογή δεν υπάρχει.Επίλεξε μία απο τις διαθέσιμες επιλογές");
                        userChoice = intChecker("Επίλεξε (1) για αναζήτηση σκηνοθέτη, ή (2) για αναζήτηση ηθοποιού\n");
                    }
                    if (userChoice == 1) { //αναζήτηση σκηνοθέτη
                        System.out.println("Δώσε το ονοματεπώνυμο του σκηνοθέτη για αναζήτηση");
                        username = input.nextLine();
                        String directorFoundName = null;
                        int directorFoundId = 0;
                        ArrayList<String> directorShows = new ArrayList<>();
                        for (Show h : showList) {
                            if (h.getShowDirectorName().equalsIgnoreCase(username)) {
                                for (Person i : personList) {
                                    if (i.getPersonName().equalsIgnoreCase(h.getShowDirectorName())) {
                                        directorFoundId = i.getPersonId();
                                    }
                                }
                                directorFoundName = h.getShowDirectorName();
                                directorShows.add(h.getShowTitle());
                            }
                        }
                        if (directorShows.isEmpty()) {
                            System.out.println("Δεν υπάρχει σκηνοθέτης με αυτό το ονοματεπώνυμο στην εφαρμογή");
                        } else {  //αν υπάρχει σκηνοθέτης τότε εμφάνιση στοιχείων και όλα τα θεάματα του
                            System.out.println("Σκηνοθέτης: ");
                            System.out.println("Ονοματεπώνυμο: " + directorFoundName);
                            System.out.println("Id: " + directorFoundId);
                            System.out.println("Θεάματα:");
                            for (String directorShow : directorShows) {
                                System.out.println(directorShow);
                            }
                            userChoice = intChecker("Θέλετε να προσθέσετε τον σκηνοθέτη στους αγαπημένους σας? (1) ΝΑΙ, (2) ΟΧΙ\n");
                            while (userChoice != 1 && userChoice != 2) {
                                System.out.println("Αυτή η επιλογή δεν υπάρχει.");
                                userChoice = intChecker("Θέλετε να προσθέσετε τον σκηνοθέτη στους αγαπημένους σας? (1) ΝΑΙ, (2) ΟΧΙ\n");
                            }
                            if (userChoice == 1){  //προσθήκη σκηνοθέτη στους αγαπημένους του
                                System.out.println("Συνδεθείτε στον λογαριασμό σας:");
                                System.out.println("Δώσε το email");
                                email = input.nextLine();
                                boolean flag = false;
                                for (UserCredentials k : userList) {
                                    if (k.getEmail().equals(email)) {
                                        flag = true;
                                        System.out.println("Δώσε το password");
                                        password = input.nextLine();
                                        if (k.getPassword().equals(password)) {
                                            ArrayList<String> userFavoriteDirectors = new ArrayList<>();
                                            if (!k.getFavoriteDirectors().isEmpty()) {
                                                userFavoriteDirectors = k.getFavoriteDirectors();
                                            }
                                            userFavoriteDirectors.add(directorFoundName);
                                            k.setFavoriteDirectors(userFavoriteDirectors);
                                            System.out.println("Ο σκηνοθέτης: " + directorFoundName + " προστέθηκε στους αγαπημένους σας επιτυχώς");
                                        } else {
                                            System.out.println("Ο κωδικός είναι λάθος");
                                        }
                                    }
                                }
                                if (!flag) {
                                    System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                                }
                            }
                        }
                    } else {            //αναζήτηση ηθοποιού
                        System.out.println("Δώσε το ονοματεπώνυμο του ηθοποιού για αναζήτηση");
                        username = input.nextLine();
                        String actorFoundName = null;
                        int actorFoundId = 0;
                        ArrayList<String> actorShows = new ArrayList<>();
                        for (Show h : showList) {
                            for (Person j : h.getShowActors()) {
                                if (j.getPersonName().equalsIgnoreCase(username)) {
                                    actorFoundName = j.getPersonName();
                                    actorFoundId = j.getPersonId();
                                    actorShows.add(h.getShowTitle());
                                    break;
                                }
                            }
                        }
                        if (actorShows.isEmpty()) {
                            System.out.println("Δεν υπάρχει ηθοποιός με αυτό το ονοματεπώνυμο στην εφαρμογή");
                        } else {        //αν υπάρχει ηθοποιός τότε εμφάνιση στοιχείων και όλα τα θεάματα του
                            System.out.println("Ηθοποιός: ");
                            System.out.println("Ονοματεπώνυμο: " + actorFoundName);
                            System.out.println("Id: " + actorFoundId);
                            System.out.println("Θεάματα:");
                            for (String actorShow : actorShows) {
                                System.out.println(actorShow);
                            }
                        }
                        userChoice = intChecker("Θέλετε να προσθέσετε τον ηθοποιό στους αγαπημένους σας? (1) ΝΑΙ, (2) ΟΧΙ\n");
                        while (userChoice != 1 && userChoice != 2) {
                            System.out.println("Αυτή η επιλογή δεν υπάρχει.");
                            userChoice = intChecker("Θέλετε να προσθέσετε τον ηθοποιό στους αγαπημένους σας? (1) ΝΑΙ, (2) ΟΧΙ\n");
                        }
                        if (userChoice == 1){       //προσθήκη ηθοποιού στους αγαπημένους του
                            System.out.println("Συνδεθείτε στον λογαριασμό σας:");
                            System.out.println("Δώσε το email");
                            email = input.nextLine();
                            boolean flag = false;
                            for (UserCredentials l : userList) {
                                if (l.getEmail().equals(email)) {
                                    flag = true;
                                    System.out.println("Δώσε το password");
                                    password = input.nextLine();
                                    if (l.getPassword().equals(password)) {
                                        ArrayList<String> userFavoriteActors = new ArrayList<>();
                                        if (!l.getFavoriteActors().isEmpty()) {
                                            userFavoriteActors = l.getFavoriteActors();
                                        }
                                        userFavoriteActors.add(actorFoundName);
                                        l.setFavoriteActors(userFavoriteActors);
                                        System.out.println("Ο ηθοποιός: " + actorFoundName + " προστέθηκε στους αγαπημένους σας επιτυχώς");
                                    } else {
                                        System.out.println("Ο κωδικός είναι λάθος");
                                    }
                                }
                            }
                            if (!flag) {
                                System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                            }
                        }
                    }
                } else { //εμφάνισή αγαπημένων ηθοποιών και σκηνοθετών μετά απο login
                    System.out.println("Sign in:");
                    System.out.println("Δώσε το email");
                    email = input.nextLine();
                    boolean flag = false;
                    for (UserCredentials k : userList) {
                        if (k.getEmail().equals(email)) {
                            flag = true;
                            System.out.println("Δώσε το password");
                            password = input.nextLine();
                            if (k.getPassword().equals(password)) {
                                System.out.println("Αγαπημένοι Ηθοποιοί");
                                if (k.getFavoriteActors().isEmpty()) {
                                    System.out.println("Δεν έχετε αγαπημένους ηθοποιούς");
                                } else {
                                    for (int i = 0; i < k.getFavoriteActors().size(); i++) {
                                        System.out.println(k.getFavoriteActors().get(i));
                                    }
                                }
                                System.out.println("Αγαπημένοι Σκηνοθέτες");
                                if (k.getFavoriteDirectors().isEmpty()) {
                                    System.out.println("Δεν έχετε αγαπημένους σκηνοθέτες");
                                } else {
                                    for (int i = 0; i < k.getFavoriteDirectors().size(); i++) {
                                        System.out.println(k.getFavoriteDirectors().get(i));
                                    }
                                }
                            } else {
                                System.out.println("Ο κωδικός είναι λάθος");
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Δεν υπάρχει χρήστης με τέτοιο email");
                    }
                }
            }
        } while (MenuChoice != 5); //επιλογή 5 = έξοδος προγράμματος
    }
}