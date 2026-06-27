# Merging

## Objective

To merge the changes from the `GitNewBranch` branch into the `main` branch.

## Commands Used

```bash
git checkout main
git diff main GitNewBranch
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
```

## Result

The changes from `GitNewBranch` were successfully merged into the `main` branch. The merged branch was deleted after completion.
