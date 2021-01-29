
package arreglotda;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ArregloTDA extends JFrame{
    private int[] arreglo;
    private JTextArea area;
    private JScrollPane scroll;
    private JButton bInserta,bEliminaEl,bEliminaTo,bBusca;
    private JTextField campo;
    private int conta=0,contaux=0;
    ArregloTDA(){
        setSize(450,300);
        setLocation(600,200);
        setTitle("Hi TDA");
        ConstruirObjetos();
    }
    private void ConstruirObjetos(){
        arreglo = new int[10];
        area = new JTextArea();
        scroll=new JScrollPane(area);
        bInserta = new JButton("Insertar");
        bEliminaEl = new JButton("Eliminar desde un elemento");
        bEliminaTo = new JButton("Eliminar todo");
        bBusca = new JButton("Buscar");
        campo = new JTextField();
        setLayout(null);
        
        scroll.setBounds(250,10,150,230);
        add(scroll);
        bInserta.setBounds(10,50,200,25);
        add(bInserta);
        bEliminaEl.setBounds(10,100,200,25);
        add(bEliminaEl);
        bEliminaTo.setBounds(10,150,200,25);
        add(bEliminaTo);
        bBusca.setBounds(10,200,200,25);
        add(bBusca);
        campo.setBounds(10,10,200,25);
        add(campo);
        
        JOptionPane.showMessageDialog(null,"Jovan Paul Mendieta Aguilar\n" +
"201829599\n" +
"27713");
        
        bInserta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(conta<10){
                int aux=0;
                try{
                    aux=Integer.valueOf(campo.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showConfirmDialog(null,"Error numerico");
                    contaux=contaux-1;
                }
                    arreglo[conta]=aux;
                    area.setText("");
                    imprimeArreglo();
                    conta++;
                }
                else JOptionPane.showMessageDialog(null,"Arreglo lleno");
            }
    });
        
    bEliminaEl.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            area.setText("");
            int aux=0;
            try{
                aux=Integer.valueOf(campo.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showConfirmDialog(null,"Error numerico");
                area.setText("");
            }
            aux=aux-1;
            conta=aux;
            for(int j=0;j<10;j++){
                if(j==aux){
                    arreglo[j]=0;
                }
            }
            for(int j=0;j<10;j++){
                System.out.println(arreglo[j]);
                area.append(j+1+".- "+arreglo[j]+"\n");
        }
        }
    });
    
    bEliminaTo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            area.setText("");
            int aux=0;
            try{
                aux=Integer.valueOf(campo.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showConfirmDialog(null,"Error numerico");
                area.setText("");
            }
            for(int j=0;j<10;j++){
                arreglo[j]=0;
            }
            for(int j=0;j<10;j++){
                System.out.println(arreglo[j]);
                area.append(j+1+".- "+arreglo[j]+"\n");
        }
        conta=0;
        }
    });
    
    bBusca.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            area.setText("");
            int aux=0;
            try{
                aux=Integer.valueOf(campo.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showConfirmDialog(null,"Error numerico");
                area.setText("");
            }
            for(int j=0;j<10;j++){
                if(arreglo[j]==aux){
                    area.append(j+1+".- "+arreglo[j]+" AQUI ESTÁ\n");
                }
                else{
                    area.append(j+1+".- "+arreglo[j]+"\n");
                }
            }
        }
    });
        
    }
    public void imprimeArreglo(){
        for(int i=0;i<10;i++){
                System.out.println(arreglo[i]);
                area.append(i+1+".- "+arreglo[i]+"\n");
        }
    }
    
    
    public static void main(String[] args) {
            
        ArregloTDA fr = new ArregloTDA();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
