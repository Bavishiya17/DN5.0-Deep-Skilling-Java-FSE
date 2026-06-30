# Conflict Resolution

## Objective

To resolve a merge conflict created when the same file was modified in two different branches.

## Commands Used

```bash
git checkout -b GitWork
git add hello.xml
git commit -m "Added hello.xml"

git checkout main
git add hello.xml
git commit -m "Updated hello.xml in main"

git merge GitWork

git add hello.xml
git commit -m "Resolved merge conflict"

git add .gitignore
git commit -m "Added .gitignore"
```

## Result

The merge conflict was resolved successfully and committed to the main branch.
