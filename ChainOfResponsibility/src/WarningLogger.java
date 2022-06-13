public class WarningLogger implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void write(Message request) {
        if ("warning".equalsIgnoreCase(request.getCommand()) || "error".equalsIgnoreCase(request.getCommand())) {
            System.out.println("Warning Logger: " + request.getCommand());
        }
        if (nextInChain == null) {
//            nextInChain.write(request);
        } else
        nextInChain.write(request);
    }
}
