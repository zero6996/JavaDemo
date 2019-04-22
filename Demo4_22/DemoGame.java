package Demo4_22;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希"); // 设置英雄名称

        // 设置英雄技能
        // 使用实现类调用
//        hero.setSkill(new SkillImpl());
//        hero.attack();
        // 使用匿名内部类调用
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("pia~~pia~~pia~~");
//            }
//        };
        // 使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("da~da~da~");
            }
        });
        hero.attack();

    }
}
