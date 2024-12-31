package jmous;

import java.util.List;

abstract class Stmt {
        interface Visitor<R> {
            R visitBlockStmt(Block stmt);
            R visitExpressionStmt(Expression stmt);
            R visitIfStmt(If stmt);
            R visitPrintStmt(Print stmt);
        }
    static class Block extends Stmt {
        Block(List<Stmt> statements) {
            this.statements = statements;
        }

        final List<Stmt> statements;

        <R> R accept(Visitor<R> visitor) {
    }

@Override
public <R> R accept(Visitor<R> visitor) {
    return visitor.visitBlockStmt(this);
}
    static class Expression extends Stmt {
        Expression(Expr expression) {
            this.expression = expression;
        }

        final Expr expression;

        <R> R accept(Visitor<R> visitor) {
    }

@Override
public <R> R accept(Visitor<R> visitor) {
    return visitor.visitExpressionStmt(this);
}
    static class If extends Stmt {
        If(Expr condition, Stmt thenBranch, Stmt elseBranch) {
            this.condition = condition;
            this.thenBranch = thenBranch;
            this.elseBranch = elseBranch;
        }

        final Expr condition;
        final Stmt thenBranch;
        final Stmt elseBranch;

        <R> R accept(Visitor<R> visitor) {
    }

@Override
public <R> R accept(Visitor<R> visitor) {
    return visitor.visitIfStmt(this);
}
    static class Print extends Stmt {
        Print(Expr expression) {
            this.expression = expression;
        }

        final Expr expression;

        <R> R accept(Visitor<R> visitor) {
    }

@Override
public <R> R accept(Visitor<R> visitor) {
    return visitor.visitPrintStmt(this);
}
}
