// Criando botões de opção utilizando ButtonGroup e JRadionButton.

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrameMurilo3b extends JFrame
{
    private JTextField textField; // utilizado para exibir alterações de fonte
    private Font plainFont; // fonte para texto simples
    private Font boldFont; // fonte para texto em negrito
    private Font italicFont; // fonte para texto em itálico
    private Font boldItalicFont; // fonte para texto em negrito e itálico
    private JRadioButton plainJRadioButton; // seleciona texto simples
    private JRadioButton boldJRadioButton; // seleciona texto em negrito
    private JRadioButton italicJRadioButton; // seleciona texto em itálico
    private JRadioButton boldItalicJRadioBUtton; // negrito e itálico
    private ButtonGroup radioGroup; // buttongroup para armazenar botões de opcão
    
    // contrutor radioButtonFrame adiciona JradioButtons ao Jframe
    public RadioButtonFrameMurilo3b()
    {
        super( "RadioButton Test" );
        setLayout( new FlowLayout() );// configurao layout de frame
        
        textField = new JTextField( "Watch the font style change", 25);
        add( textField ); // adiciona textField ao JFrame
        
        // cria botões de opção
        plainJRadioButton = new JRadioButton( "Plain", true );
        boldJRadioButton = new JRadioButton( "Bold", false );
        italicJRadioButton = new JRadioButton( "Italic", false );
        JRadioButton boldItalicJRadioButton = new JRadioButton( "Bold/Italic", false);
        add( plainJRadioButton ); // adiciona botão no estilo simples ao JFrame
        add( boldJRadioButton ); // adiciona botão de negrito ao JFrame
        add( italicJRadioButton );
        add( boldItalicJRadioButton );
        
        // cria relacionamento lógico entre JRadioButtons
        radioGroup = new ButtonGroup(); // cria buttonGroup
        radioGroup.add( plainJRadioButton ); // adiciona simples ao grupo
        radioGroup.add( boldJRadioButton ); //adiciona negrito ao grupo
        radioGroup.add( italicJRadioButton ); // adiciona itálico ao grupo
        radioGroup.add( boldItalicJRadioButton); // adiciona negrito e itálico
        
        //cria fonte de objetos
        plainFont = new Font( "Serif", Font.PLAIN, 14);
        boldFont = new Font( "Serif", Font.BOLD, 14);
        italicFont = new Font( "Serif", Font.ITALIC, 14);
        boldItalicFont = new Font( "Serif", Font.ITALIC, 14);
        textField.setFont( plainFont ); // configura a fonte inicial como simples
        
        // registra eventos para JRadioButtons
        plainJRadioButton.add(
             new RadioButtonHandler( plainFont ) );
        boldJRadioButton.addItemListener(
             new RadioButtonHandler( boldFont ) );
    }
    }
    