package PharmaGest;


import javax.swing.*;


public class medicamentsControlleur {
    public static void main(String[] arg){
        JMenuBar MyMenuBar=new JMenuBar();
        JMenu MenuNom=new JMenu("Nom");

        MyMenuBar.add(MenuNom);
        JMenuItem MenuDoliprane=new JMenuItem("Doliprane");
        JMenuItem MenuEfferalgan=new JMenuItem("Efferalgan");
        JMenuItem MenuDafalgan=new JMenuItem("Dafalgan");
        JMenuItem MenuSpasfon=new JMenuItem("Spasfon");
        MenuNom.add(MenuDoliprane);
        MenuNom.add(MenuEfferalgan);
        MenuNom.add(MenuDafalgan);
        MenuNom.add(MenuSpasfon);
        MenuNom.add(MenuDoliprane);


    }

}


