import java.util.*;
public class VotingSystem {
  private Map<String, Integer> voteCountMap = new HashMap<>();
  private Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
  private Map<String, Integer> sortedVoteMap = new TreeMap<>();

  public void castVote(String candidate) {
    voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);
    orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0) + 1);
    sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
  }

  public void displayVotes() {
    System.out.println("Votes stored in HashMap (Candidate -> Votes): " + voteCountMap);
    System.out.println("Votes stored in LinkedHashMap (Order of Votes): " + orderedVoteMap);
    System.out.println("Votes stored in TreeMap (Sorted by Candidate): " + sortedVoteMap);
  }

  public static void main(String[] args) {
    VotingSystem vs = new VotingSystem();
    vs.castVote("voter1");
    vs.castVote("voter2");
    vs.castVote("voter3");
    vs.castVote("voter4");
    vs.castVote("voter5");
    vs.displayVotes();
  }
}