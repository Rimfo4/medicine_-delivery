import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    JPanel test_p = new JPanel();
    JFrame f = new JFrame();
    JPanel view_p = new JPanel();
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

    GUI(int a){

    }

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


        serch.setBounds(540-serch.getWidth()/2,230-serch.getHeight()/2,408,420);
        del.setBounds(58-del.getWidth()/2,230-del.getHeight()/2,408,420);
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
                System.out.println(InputData.name+" "+InputData.addr);

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

        p.add(del);
        p.add(serch);
        p.add(ma);

        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);

        serch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(p);
                test();
                f.revalidate();
                f.repaint();
                new Thread(() -> {
                    new Medicine();
                }).start();
            };
        });
    }

    void test(){
        String tt1 = "현재 "+InputData.name+"님은 검사를 진행중입니다...";
        JLabel t1 = new JLabel(tt1);
        JLabel t2 = new JLabel("하단에 실행창에서 검사를 진행해주십시오");
        JLabel ma1 = ma;
        JButton check = new JButton("결과 보기");

        test_p.setSize(1000,700);
        test_p.setLayout(null);
        test_p.setBackground(Color.WHITE);

        check.setFont(new Font("맑은 고딕",Font.BOLD,50));
        t2.setFont(new Font("맑은 고딕",Font.BOLD,35));
        t1.setFont(new Font("맑은 고딕",Font.BOLD,35));

        check.setBorder(new LineBorder(Color.black,1));
        check.setBackground(Color.white);

        check.setBounds(350-check.getWidth()/2,543-check.getHeight()/2,300,84);
        t2.setBounds(86-t2.getWidth()/2,431-t2.getHeight()/2,829,58);
        t1.setBounds(86-t1.getWidth()/2,319-t1.getHeight()/2,783,58);
        ma1.setBounds(0,0,1000,186);

        f.add(test_p);
        test_p.add(ma1);
        test_p.add(t1);
        test_p.add(t2);
        test_p.add(check);

        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(test_p);
                f.revalidate();
                f.repaint();
                view();
            }
        });
    }

    void view(){
        String tt1 = "현재 "+InputData.name+"님 의심 병은 "+InputData.disease_name+" 입니다";
        JLabel t1 = new JLabel(tt1);
        JLabel t2 = new JLabel("추천하는 약은 "+InputData.drug+"입니다");
        JButton check = new JButton("확인");

        check.setBorder(new LineBorder(Color.black,1));
        check.setBackground(Color.white);
        check.setBounds(350-check.getWidth()/2,543-check.getHeight()/2,300,84);

        f.remove(test_p);
        f.revalidate();
        f.repaint();

        check.setFont(new Font("맑은 고딕",Font.BOLD,50));
        t2.setFont(new Font("맑은 고딕",Font.BOLD,35));
        t1.setFont(new Font("맑은 고딕",Font.BOLD,35));

        view_p.setSize(1000,700);
        view_p.setLayout(null);
        view_p.setBackground(Color.WHITE);

        ma.setBounds(0,0,1000,186);
        t2.setBounds(86-t2.getWidth()/2,431-t2.getHeight()/2,747,58);
        t1.setBounds(86-t1.getWidth()/2,319-t1.getHeight()/2,659,58);

        f.add(view_p);
        view_p.add(ma);
        view_p.add(t1);
        view_p.add(t2);
        view_p.add(check);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(view_p);
                f.revalidate();
                f.repaint();
                main();
            }
        });


    }



}
