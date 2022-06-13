public class ErrorLogger implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void write(Message request) {
        if ("error".equalsIgnoreCase(request.getCommand())) {
            System.out.println("Error Logger: " + request.getCommand());
        }
        if (nextInChain == null) {
//            nextInChain.write(request);
        } else
        nextInChain.write(request);
    }
    }


