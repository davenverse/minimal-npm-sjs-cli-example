# minimal-npm-sjs-cli-example - Minimal NPM CLI Example [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.chrisdavenport/minimal-npm-cli-example_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.chrisdavenport/minimal-npm-cli-example_2.13) ![Code of Conduct](https://img.shields.io/badge/Code%20of%20Conduct-Scala-blue.svg)

## [Head on over to the microsite](https://davenverse.github.io/minimal-npm-cli-example)

## Quick Start

### Get your NPM_TOKEN

1. Go to [NPM](https://www.npmjs.com/)
2. Login
3. Click on your profile photo in the top right corner, and select `Access Tokens`
4. Create a new token with the Automation type, name it something that helps you identify it.
5. Come back to your repo, and click Settings
6. On the left hand bar that appears, click Secrets -> Actions
7. New Repository Secret in the top right corner and set `NPM_TOKEN` to the value of your token.

### Write your application

Write an application that does what you want.

### Publish to NPM

Create a Release on Github. The tag should start with v and be in semver. Like `v0.0.1`

