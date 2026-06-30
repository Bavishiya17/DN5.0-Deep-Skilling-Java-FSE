# Branching

## Objective

To create a new branch, switch to it, make changes, commit the changes, and verify the branch status.

## Commands Executed

```bash
git branch GitNewBranch

git branch -a

git checkout GitNewBranch

echo "This is a sample file for Git Branching Exercise." > sample.txt

git add sample.txt

git commit -m "Added sample.txt in GitNewBranch"

git status
```

## Explanation

* `git branch GitNewBranch` creates a new branch.
* `git branch -a` lists all local and remote branches.
* `git checkout GitNewBranch` switches to the new branch.
* `git add sample.txt` stages the file.
* `git commit -m "Added sample.txt in GitNewBranch"` commits the changes.
* `git status` displays the current repository status.

## Result

A new branch named **GitNewBranch** was successfully created. A new file was added and committed to the branch, and the repository status showed a clean working tree.
