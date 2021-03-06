package openblocks.codeblocks;

public class CompilerException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public enum Error {UNSUPPORTED_VALUE}
	
    /** USE_DEBUGGING_MESSAGES is whether the messages are friendly to developers, as opposed to friendly to users. */
    private static final boolean USE_DEBUGGING_MESSAGES = false;
	
	private Error error;
	private Long illegalBlockID;
	private String label;

    public CompilerException(Error error, Long illegalBlockID) {
    	this.error = error;
    	this.illegalBlockID = illegalBlockID;
    	label = Block.getBlock(illegalBlockID).getBlockLabel();
    }

    public String getMessage() {
    	StringBuilder ans = new StringBuilder(USE_DEBUGGING_MESSAGES ? "Block " + illegalBlockID + " " + label + ": " :"");
    	switch (error) {
    	case UNSUPPORTED_VALUE:
    		ans.append("Unsupported value.");
    	    	    break;
    	default:
    	    ans.append("Unknown error");
    	}

    	return ans.toString();
    }
}
