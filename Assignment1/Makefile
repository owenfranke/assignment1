# binary search program makefile
# Hussein Suleman
# 22 March 2017

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class

SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=BTQueueNode.class BTQueue.class \
	 BinaryTreeNode.class BinaryTree.class \
 	 BinarySearchTree.class BinarySearchTreeTest.class\
	 LSData.class LSArray.class LSArrayApp.class
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class
run:
	@java -cp bin LSArrayApp