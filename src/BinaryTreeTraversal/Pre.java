package BinaryTreeTraversal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Pre {
    List<Integer>list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root){
        if(root!=null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
