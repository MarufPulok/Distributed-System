public interface Chain {
    public void setNextChain(Chain nextChain);
    public void write(Message request);
}
