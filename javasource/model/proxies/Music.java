// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package model.proxies;

public class Music extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Model.Music";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		order("order"),
		name("name"),
		html("html"),
		lyrics("lyrics"),
		myguid("myguid"),
		picUrl("picUrl"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Music(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Music(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject musicMendixObject)
	{
		super(context, musicMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, musicMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Music.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static model.proxies.Music initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return model.proxies.Music.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static model.proxies.Music initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new model.proxies.Music(context, mendixObject);
	}

	public static model.proxies.Music load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return model.proxies.Music.initialize(context, mendixObject);
	}

	public static java.util.List<model.proxies.Music> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> model.proxies.Music.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of order
	 */
	public final java.lang.Integer getorder()
	{
		return getorder(getContext());
	}

	/**
	 * @param context
	 * @return value of order
	 */
	public final java.lang.Integer getorder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.order.toString());
	}

	/**
	 * Set value of order
	 * @param order
	 */
	public final void setorder(java.lang.Integer order)
	{
		setorder(getContext(), order);
	}

	/**
	 * Set value of order
	 * @param context
	 * @param order
	 */
	public final void setorder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.order.toString(), order);
	}

	/**
	 * @return value of name
	 */
	public final java.lang.String getname()
	{
		return getname(getContext());
	}

	/**
	 * @param context
	 * @return value of name
	 */
	public final java.lang.String getname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.name.toString());
	}

	/**
	 * Set value of name
	 * @param name
	 */
	public final void setname(java.lang.String name)
	{
		setname(getContext(), name);
	}

	/**
	 * Set value of name
	 * @param context
	 * @param name
	 */
	public final void setname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.name.toString(), name);
	}

	/**
	 * @return value of html
	 */
	public final java.lang.String gethtml()
	{
		return gethtml(getContext());
	}

	/**
	 * @param context
	 * @return value of html
	 */
	public final java.lang.String gethtml(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.html.toString());
	}

	/**
	 * Set value of html
	 * @param html
	 */
	public final void sethtml(java.lang.String html)
	{
		sethtml(getContext(), html);
	}

	/**
	 * Set value of html
	 * @param context
	 * @param html
	 */
	public final void sethtml(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String html)
	{
		getMendixObject().setValue(context, MemberNames.html.toString(), html);
	}

	/**
	 * @return value of lyrics
	 */
	public final java.lang.String getlyrics()
	{
		return getlyrics(getContext());
	}

	/**
	 * @param context
	 * @return value of lyrics
	 */
	public final java.lang.String getlyrics(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.lyrics.toString());
	}

	/**
	 * Set value of lyrics
	 * @param lyrics
	 */
	public final void setlyrics(java.lang.String lyrics)
	{
		setlyrics(getContext(), lyrics);
	}

	/**
	 * Set value of lyrics
	 * @param context
	 * @param lyrics
	 */
	public final void setlyrics(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lyrics)
	{
		getMendixObject().setValue(context, MemberNames.lyrics.toString(), lyrics);
	}

	/**
	 * @return value of myguid
	 */
	public final java.lang.String getmyguid()
	{
		return getmyguid(getContext());
	}

	/**
	 * @param context
	 * @return value of myguid
	 */
	public final java.lang.String getmyguid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.myguid.toString());
	}

	/**
	 * Set value of myguid
	 * @param myguid
	 */
	public final void setmyguid(java.lang.String myguid)
	{
		setmyguid(getContext(), myguid);
	}

	/**
	 * Set value of myguid
	 * @param context
	 * @param myguid
	 */
	public final void setmyguid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String myguid)
	{
		getMendixObject().setValue(context, MemberNames.myguid.toString(), myguid);
	}

	/**
	 * @return value of picUrl
	 */
	public final java.lang.String getpicUrl()
	{
		return getpicUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of picUrl
	 */
	public final java.lang.String getpicUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.picUrl.toString());
	}

	/**
	 * Set value of picUrl
	 * @param picurl
	 */
	public final void setpicUrl(java.lang.String picurl)
	{
		setpicUrl(getContext(), picurl);
	}

	/**
	 * Set value of picUrl
	 * @param context
	 * @param picurl
	 */
	public final void setpicUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String picurl)
	{
		getMendixObject().setValue(context, MemberNames.picUrl.toString(), picurl);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final model.proxies.Music that = (model.proxies.Music) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
