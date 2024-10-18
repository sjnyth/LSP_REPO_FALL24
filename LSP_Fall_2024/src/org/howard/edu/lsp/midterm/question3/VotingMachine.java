package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * A voting machine that allows adding candidates and casting votes.
 */
public class VotingMachine {

    private Map<String, Integer> candidates;

    /**
     * Constructs a new VotingMachine with an empty list of candidates.
    */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the voting machine.
     *
     * @param name The name of the candidate to add.
     *             If the candidate is already added, a message will be printed.
    */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);
        } else {
            System.out.println("Candidate " + name + " is already added.");
        }
    }

    /**
     * Casts a vote for a specified candidate.
     *
     * @param name The name of the candidate to vote for.
     *             If the candidate is not found, a message will be printed.
    */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate " + name + " is not found.");
        }
    }

    /**
     * Returns a string representation of the current candidates and their vote counts.
     *
     * @return A string listing each candidate and the number of votes they have received.
    */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

    /**
     * The main method to run the VotingMachine demo.
    */
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toString());
    }
}
