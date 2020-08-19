package linkedlist;

public class SingleLinkedListDemo {

    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1,"松江","及时雨");
        HeroNode hero2 = new HeroNode(2,"张","娜");
        HeroNode hero3 = new HeroNode(3,"许","芳");
        HeroNode hero4 = new HeroNode(4,"汪","倍");

        //节点给链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //加入
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        singleLinkedList.list();

    }

}

//定义SingleLinkedList
class SingleLinkedList{
    //初始化一个头结点
    private HeroNode head = new HeroNode(0,"","");

    //添加节点到单链表
    public void add(HeroNode heroNode){
        //因为head结点不能动，因此我们需要一个辅助遍历temp
        HeroNode temp = head;
        while (true){
            //找到链表的最后
            if(temp.next == null){
                break;
            }
            //如果没有找到最后，将temp后移
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表的最后
        temp.next = heroNode;
    }

    //显示链表（遍历）
    public void list(){
        if(head.next == null){
            System.out.println("链表空");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            //显示节点信息
            System.out.println(temp);
            //temp后移
            temp = temp.next;
        }
    }

}



//定义HeroNode,每个HeroNode对象就是一个节点
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;    //指向下一个节点

    //构造方法
    public HeroNode(int no,String name,String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    //为了显示方法，我们重写toString
    @Override
    public String toString(){
        return "HeroNode [no=" + no + ",name = " + name + ",nickname = " + nickname + "]";
    }
}
