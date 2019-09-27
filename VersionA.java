import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class CT1{

public int x =0, y=0,hp=100,ehp = 50, Dam , Any;
public Random bob = new Random();
Any = bob.nextInt(5) + 1; 
public CT1{
Jframe app = new Jframe ("Codex tempus version A");
JTextfeld label = new JTextfeld ("You have awaken in the ruins of New Constantinople");
Jbutton button1 = new Jbutton ("Attack");
button1.setVisible(false); 
Jbutton button = new Jbutton ("Move fowards");
button.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){ 
               if(Any = 1){
                y+= 10;
                label.setText("You found nothing");
                }
                if (Any = 2){
                  y+= 10;
                label.setText("You found a old trade center and nobody is there."); 
                  }
               if(Any = 3){
             y+= 10;
                label.setText("You found a computer but it is offline.");
               }
             if(Any = 4){
             y+= 10;
                label.setText("You found old tower but nothing is worth anything.");
             }
           if(Any = 5){
             y+= 10;
         button.setVisible(false); 
          hp-=6;
                label.setText("raider attacked you"+hp+" health left."); 
             button1.setVisible(true);  
           button.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){ 
                 if(Any = 1){
                   ehp-=10;
                    Dam+=1;
                  label.setText("You have attacked the raider"+ehp+" his health."); 
                   if(Dam >=1){
                     hp-=6;
                label.setText("raider attacked you"+hp+" health left.");
                              }
               if (ehp<= 0){
                   label.setText("You have killed the raider"); 
                   button1.setVisible(false); 
                   button.setVisible(true); 
 }
                if(Any = 2){
                   ehp-=20;
                    Dam+=1;
                  label.setText("You have attacked the raider"+ehp+" his health."); 
                   if(Dam >=1){
                     hp-=7;
                label.setText("raider attacked you"+hp+" health left.");
                              }
               if (ehp<= 0){
                   label.setText("You have killed the raider"); 
                   button1.setVisible(false); 
                   button.setVisible(true); 
 }
                 if(Any = 3){
                   ehp-=30;
                    Dam+=1;
                  label.setText("You have attacked the raider"+ehp+" his health."); 
                   if(Dam >=1){
                     hp-=4;
                label.setText("raider attacked you"+hp+" health left.");
                              }
                               if (ehp<= 0){
                   label.setText("You have killed the raider"); 
                   button1.setVisible(false); 
                   button.setVisible(true); 
 }
                if(Any = 4){
                   ehp-=40;
                    Dam+=1;
                  label.setText("You have attacked the raider"+ehp+" his health."); 
                   if(Dam >=1){
                     hp-=2;
                label.setText("raider attacked you"+hp+" health left.");
                              }
                                   if (ehp<= 0){
                   label.setText("You have killed the raider"); 
                   button1.setVisible(false); 
                   button.setVisible(true); 
 }
                         if(Any = 5){
                   ehp-=50;
                    Dam+=1;
                  label.setText("You have attacked the raider"+ehp+" his health."); 
                   if(Dam >=1){
                     hp-=6;
                label.setText("raider attacked you"+hp+" health left.");
                              }
                if (ehp<= 0){
                   label.setText("You have killed the raider"); 
                   button1.setVisible(false); 
                   button.setVisible(true); 
 } 
} 
});  


        
    });
label.setBounds(50,50, 150,20);    
app.add(label);    
button.setBounds(100,100,100, 40);    
app.add(button);    
app.setSize(300,400);    
app.setLayout(null);    
app.setVisible(true);    
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
    public static void main(String[] args) {
        new Demo();
    }
}

