1.create a github account, then remote create a repository named learnGit
2.open your local terminal and create a local directory named learnGit
3.connect the remote "learnGit" with your local "learnGit" by using:
  git remote add origin(you can name it as whatever you want) url(https://github.com/lili87523/learnGit.git)
4. then you can work at your local desktop, then 
  (1)git add filename / dirname
  (2)git commit -m "this commit's name"
  (3)git push -u origin master


Issues:
It is not easy to connect the remote with local.
Recommend to use the SSH to make sure it is safe to surf on internet.
1.make sure your own computer has an isa key pair, it should be in your ~/.ssh
 if you do not have one, then use command: "ssh-keygen" to create a new pair;
 then "vim ~/.ssh/id_rsa.pub" to copy the public key; then go to your remote github -> setting -> SSH AND GPG keys -> SSH keys, do the paste. Then you connect your local key with your computer key;
2.just step 1 is not enough. We need to set your local .git/config file to let git know the correct url: vim .git/config; then change the url part: url=git@github.com:lili87523/learnGit.git 

