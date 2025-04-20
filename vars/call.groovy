def call(String repo_url, String branch = 'main') {
    git url: repo_url, branch: branch
}
