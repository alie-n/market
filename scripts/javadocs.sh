#!/bin/bash

if [[ $TRAVIS_COMMIT_MESSAGE != "update javadoc" ]]; then

    - git config --global user.name "travis-ci"
    - git config --global user.email "travis@travis-ci.org"

    - cd $HOME

    - git clone --quiet --branch=master https://$GITHUB_TOKEN@github.com/alie-n/market.git market

    - rm -r $HOME/market/docs/apidocs
    - cp -r $HOME/build/alie-n/market/target/site/apidocs $HOME/market/docs/

    - cd $HOME/market

    - git add .
    - git commit -m "update javadoc"
    - git push https://$GITHUB_TOKEN@github.com/alie-n/market master

    - rm -rf $HOME/market

fi