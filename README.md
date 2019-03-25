# Spock Demo工程

##Spock Maven import

##Spock 特性分析
```jshelllanguage
setup 用于每个test之前运行一次，在given之前运行，
setupSpec 在单个test或全部test运行时，只在最开始执行一次
cleanup 在每个test运行之后运行一次，在then之后
cleanupSpec 在单个test或多个test运行时，只在最末尾执行一次
```