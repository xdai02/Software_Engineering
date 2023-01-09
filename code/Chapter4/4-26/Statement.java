public class Statement implements Node {
    private String stmt;

    public Statement(String stmt) {
        this.stmt = stmt;
    }

    @Override
    public void accept(Visitor visitor) {
        for(String token : stmt.split(" ")) {
            // 合法变量名
            if(token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                new Variable(token).accept(visitor);
            }
            // 运算符：= + - * /
            else if(token.matches("[=]")) {
                new Operator(token).accept(visitor);
            }
            // 运算数：实数
            else if(token.matches("((\\+|-)?([0-9]+)(\\.[0-9]+)?)|((\\+|-)?\\.?[0-9]+)")) {
                new Number(token).accept(visitor);
            }
        }
    }
}
