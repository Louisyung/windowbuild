package windowbuild;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AdminPanel extends JFrame {
    private JPanel contentPane;
    private JList<String> userList;
    private DefaultListModel<String> userModel;

    public AdminPanel() {
        setTitle("管理員介面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        userModel = new DefaultListModel<>();
        userList = new JList<>(userModel);
        JScrollPane scrollPane = new JScrollPane(userList);
        scrollPane.setPreferredSize(new Dimension(400, 300));
        contentPane.add(scrollPane);

        // 加載用戶列表按鈕
        JButton btnLoadUsers = new JButton("加載用戶列表");
        btnLoadUsers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadUserList();
            }
        });
        contentPane.add(btnLoadUsers);

        // 編輯選定用戶按鈕
        JButton btnEditUser = new JButton("編輯選定用戶");
        btnEditUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //editSelectedUser();
            }
        });
        contentPane.add(btnEditUser);

        // 刪除選定用戶按鈕
        JButton btnDeleteUser = new JButton("刪除選定用戶");
        btnDeleteUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteSelectedUser();
            }
        });
        contentPane.add(btnDeleteUser);
    }

    // 加載用戶列表
    private void loadUserList() {
        File userDir = new File("C:\\Users\\USER\\eclipse-workspace\\windowbuild\\database\\");
        File[] userFiles = userDir.listFiles((dir, name) -> name.endsWith(".json"));
        userModel.clear();
        if (userFiles != null) {
            for (File file : userFiles) {
                userModel.addElement(file.getName().replace(".json", ""));
            }
        }
    }

    // 更新用戶密碼
    private void updateUserPassword(String username, String newPassword) {
        try {
            String userFilePath = "C:\\Users\\USER\\eclipse-workspace\\windowbuild\\database\\" + username + ".json";
            JSONParser parser = new JSONParser();
            JSONObject userObject = (JSONObject) parser.parse(new FileReader(userFilePath));
            
            userObject.put("password", newPassword);

            try (FileWriter file = new FileWriter(userFilePath)) {
                file.write(userObject.toJSONString());
            }
            JOptionPane.showMessageDialog(this, "密碼更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "更新失敗");
        }
    }

    // 刪除選定的用戶
    private void deleteSelectedUser() {
        String selectedUser = userList.getSelectedValue();
        if (selectedUser != null) {
            int response = JOptionPane.showConfirmDialog(this, "確定刪除用戶 " + selectedUser + "?", "刪除用戶", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                String userFilePath = "C:\\Users\\USER\\eclipse-workspace\\windowbuild\\database\\" + selectedUser + ".json";
                File userFile = new File(userFilePath);
                userFile.delete();
                userModel.removeElement(selectedUser); // 更新列表模型
                JOptionPane.showMessageDialog(this, "用戶刪除成功");
            }
        }
    }


    // 從 users資料夾文件中刪除用戶
    private void deleteUser(String username) {
        String userFilePath = "C:\\Users\\USER\\eclipse-workspace\\windowbuild\\database\\users\\" + username + ".json";
        File userFile = new File(userFilePath);
        if (userFile.exists()) {
            boolean deleted = userFile.delete();
            if (deleted) {
                userModel.removeElement(username); // 更新列表模型
                JOptionPane.showMessageDialog(this, "用戶刪除成功");
            } else {
                JOptionPane.showMessageDialog(this, "刪除失敗");
            }
        } else {
            JOptionPane.showMessageDialog(this, "找不到用戶文件");
        }
    }
    

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminPanel frame = new AdminPanel();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}