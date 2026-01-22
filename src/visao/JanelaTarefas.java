package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import modelo.Tarefa;

public class JanelaTarefas extends JFrame{

	public JanelaTarefas() throws HeadlessException {

		setTitle("To-Do List");
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		DefaultListModel<Tarefa> modelLista = new DefaultListModel<>();
		JList<Tarefa> listaVisual = new JList<>(modelLista);
		
		JTextField campoTarefa = new JTextField(20);
		JButton botaoAdicionar = new JButton("Adicionar");
		JButton botaoConcluir = new JButton("Concluir");
		JButton botaoRemover = new JButton("Remover");
		
		JPanel painelEntrada = new JPanel();
		painelEntrada.setBackground(new Color(217, 215, 182));
		
		painelEntrada.add(campoTarefa);
		campoTarefa.setForeground(new Color(79, 77, 70));
		campoTarefa.setFont(new Font("SansSerif", Font.BOLD, 12));
		painelEntrada.add(botaoAdicionar);
		botaoAdicionar.setBackground(new Color(237,232,208));
		botaoAdicionar.setForeground(new Color(79, 77, 70));
		botaoAdicionar.setFont(new Font("SansSerif", Font.BOLD, 12));
		botaoAdicionar.setFocusPainted(false);
		botaoAdicionar.addActionListener(e -> {
			String texto = campoTarefa.getText().trim();
			if (!texto.isEmpty()) {
				Tarefa novaTarefa = new Tarefa(texto);
				modelLista.addElement(novaTarefa);
				campoTarefa.setText(""); //deixar o campo vazio após concluir ação
			}
		});
		
		painelEntrada.add(botaoConcluir);
		botaoConcluir.setBackground(new Color(237,232,208));
		botaoConcluir.setForeground(new Color(79, 77, 70));
		botaoConcluir.setFont(new Font("SansSerif", Font.BOLD, 12));
		botaoConcluir.setFocusPainted(false);
		botaoConcluir.addActionListener(e -> {
			Tarefa selecionada = listaVisual.getSelectedValue();
			if(selecionada != null) {
				selecionada.concluir();
				
				listaVisual.repaint(); //atualiza oq mostra na lista pro simbolo de verificado aparecer
			}
		});
		
		painelEntrada.add(botaoRemover);
		botaoRemover.setBackground(new Color(237,232,208));
		botaoRemover.setForeground(new Color(79, 77, 70));
		botaoRemover.setFont(new Font("SansSerif", Font.BOLD, 12));
		botaoRemover.setFocusPainted(false);
		botaoRemover.addActionListener(e -> {
			int index = listaVisual.getSelectedIndex();
			if (index >= 0) {
				modelLista.remove(index);
			}
		});
		
		add(new JScrollPane(listaVisual), BorderLayout.CENTER);
		listaVisual.setBackground(new Color(247, 244, 228));
		listaVisual.setForeground(new Color(79, 77, 70));
		listaVisual.setFont(new Font("SansSerif", Font.BOLD, 16));
		add(painelEntrada, BorderLayout.SOUTH);
		painelEntrada.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		painelEntrada.setLayout(new GridLayout(1, 3, 5, 5));
		
		setVisible(true);
	}

	
	
}
