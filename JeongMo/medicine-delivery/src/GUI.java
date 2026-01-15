import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    JFrame f = new JFrame();
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    ImageIcon icon = new ImageIcon("img/Group 12.png");
    ImageIcon icon1 = new ImageIcon("img/Group 11.png");
    ImageIcon icon2 = new ImageIcon("img/Group 13.png");
    JLabel ma = new  JLabel(icon2);
    JButton serch = new  JButton(icon1);
    JButton del = new  JButton(icon);
    JTextField addr_t = new JTextField();
    JTextField name_t = new JTextField();


    //주소 이름 입력창
    GUI(){
        JButton check = new JButton("확인");
        JLabel name_l = new JLabel("이름");
        JLabel addr_l = new JLabel("주소");

        check.setFont(new Font("맑은 고딕",Font.BOLD,50));
        name_l.setFont(new Font("맑은 고딕",Font.BOLD,50));
        addr_l.setFont(new Font("맑은 고딕",Font.BOLD,50));
        name_t.setFont(new Font("맑은 고딕",Font.BOLD,35));
        addr_t.setFont(new Font("맑은 고딕",Font.BOLD,35));

        f.setSize(1000,700);
        p1.setSize(1000,700);

        p1.setLayout(null);
        p1.setBackground(Color.white);

        check.setBounds(287-name_t.getWidth()/2,558-name_t.getHeight()/2,426,82);
        name_t.setBounds(302-name_t.getWidth()/2,278-name_t.getHeight()/2,500,72);
        addr_t.setBounds(302-addr_t.getWidth()/2,423-addr_t.getHeight()/2,500,72);
        name_l.setBounds(156- name_l.getWidth()/2,274- name_l.getHeight()/2,130,77);
        addr_l.setBounds(156-addr_l.getWidth()/2,420-addr_l.getHeight()/2,130,77);
        ma.setBounds(0,0,1000,186);

        check.setBorder(new LineBorder(Color.black,1));
        check.setBackground(Color.white);

        f.add(p1);
        p1.add(ma);
        p1.add(name_l);
        p1.add(addr_l);
        p1.add(addr_t);
        p1.add(name_t);
        p1.add(check);

        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputData.name = name_t.getText();
                InputData.addr = addr_t.getText();
                System.out.println(InputData.name+" "+ InputData.addr);

                f.remove(p1);
                main();
            }
        });
    }
    //메인화면
    void main(){
        p.setSize(1000,700);
        f.setSize(1000,700);
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        f.add(p);
        del.setBorderPainted(false);
        serch.setBorderPainted(false);
        del.setContentAreaFilled(false);
        serch.setContentAreaFilled(false);
        ma.setBounds(0,0,1000,186);
        serch.setBounds(540-del.getWidth()/2,230-del.getHeight()/2,408,420);
        del.setBounds(58-del.getWidth()/2,230-del.getHeight()/2,408,420);
        p.add(del);
        p.add(serch);
        p.add(ma);

        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
