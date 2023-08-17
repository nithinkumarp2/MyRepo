class parent
{parent()
	{
		system.out.println("0-args parent cons");
	}
	parent(int a)
	{    this();
         system.out.println("1-args parent cons");
	}

}
class child extends parent
{
	child()
	{    super();
		system.out.println("0-args child cons");
	}
	child(int a)
	{     super()
		 system.out.println("1-args child cons");
	}
	new child();
}
}
