#!/bin/bash

if [[ $TRAVIS_COMMIT_MESSAGE != "update javadoc" ]]; then

    git config --global user.name "travis-ci"
    git config --global user.email "travis@travis-ci.org"

    cd $HOME

    git clone --quiet --branch=master https://$GITHUB_TOKEN@github.com/xxcw/marketplace.git marketplace

    rm -r $HOME/marketplace/docs/apidocs
    cp -r $HOME/build/xxcw/marketplace/target/site/apidocs $HOME/marketplace/docs/

    cd $HOME/market

    git add -f .
    git commit -m "update javadoc"
    git push -fq https://$GITHUB_TOKEN@github.com/xxcw/marketplace master

    rm -rf $HOME/marketplace

fi