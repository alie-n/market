#!/bin/sh

if ["`git show -s --format='%ae'`" -ne "travis@travis-ci.org"];
then

    rm -r $HOME/market/docs/apidocs
    cp -r $HOME/build/alie-n/market/target/site/apidocs $HOME/market/docs/

    cd $HOME/market

    git add .
    git commit -m "update javadoc. build $TRAVIS_BUILD_NUMBER"
    git push https://$GITHUB_TOKEN@github.com/alie-n/market master

fi