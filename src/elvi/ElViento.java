package elvi;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Date;
import java.util.List;

public class ElViento extends JFrame{
    private JTextField txtId = new JTextField(5);
    private JTextField txtNome = new JTextField(20);
    private JTextField txtEmail = new JTextField(20);
    private JTextField txtDataNasc = new JTextField(10);
    private JTextField txtTelefone = new JTextField(15);
    private JTextField txtCpf = new JTextField(14);
    private JTable tabelaPessoas;
    private DefaultTableModel modeloTabela;
    private PessoaDAO dao = new PessoaDAO();

    public ElViento(){
        setTitle("El Viento -> Cadastros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(800, 600);

        // painel de inserção de dados
        JPanel painelInput = new JPanel(new GridLayout(7,2,5,5));
        painelInput.add(new JLabel("ID"));
        painelInput.add(txtId);
        painelInput.add(new JLabel("Nome:"));
        painelInput.add(txtNome);
        painelInput.add(new JLabel("Email:"));
        painelInput.add(txtEmail);
        painelInput.add(new JLabel("Data de Nascimento: "));
        painelInput.add(txtDataNasc);
        painelInput.add(new JLabel("Telefone: "));
        painelInput.add(txtTelefone);
        painelInput.add(new JLabel("CPF: "));
        painelInput.add(txtCpf);

        // botões
        JPanel painelBotoes = new JPanel();
        JButton btCadastrar = new JButton("CADASTRAR");
        JButton btListar = new JButton("LISTAR");
        JButton btAtualizar = new JButton("ATUALIZAR");
        JButton btDeletar = new JButton("DELETAR");
        painelBotoes.add(btCadastrar);
        painelBotoes.add(btListar);
        painelBotoes.add(btAtualizar);
        painelBotoes.add(btDeletar);

        // CONINUAR CODIGO A PARTIR DAQUI
        // LINK: https://www.blackbox.ai/chat/511Fauo
    }
}