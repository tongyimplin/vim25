package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultInvalidVnic;
import com.vmware.vim25.IscsiFaultPnicInUse;
import com.vmware.vim25.IscsiFaultVnicAlreadyBound;
import com.vmware.vim25.IscsiFaultVnicHasActivePaths;
import com.vmware.vim25.IscsiFaultVnicHasMultipleUplinks;
import com.vmware.vim25.IscsiFaultVnicHasNoUplinks;
import com.vmware.vim25.IscsiFaultVnicHasWrongUplink;
import com.vmware.vim25.IscsiFaultVnicInUse;
import com.vmware.vim25.IscsiFaultVnicIsLastPath;
import com.vmware.vim25.IscsiFaultVnicNotBound;
import com.vmware.vim25.IscsiFaultVnicNotFound;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiFault")
@XmlSeeAlso({IscsiFaultVnicHasMultipleUplinks.class, IscsiFaultVnicInUse.class, IscsiFaultVnicIsLastPath.class, IscsiFaultInvalidVnic.class, IscsiFaultVnicHasNoUplinks.class, IscsiFaultVnicNotFound.class, IscsiFaultVnicNotBound.class, IscsiFaultVnicAlreadyBound.class, IscsiFaultVnicHasActivePaths.class, IscsiFaultPnicInUse.class, IscsiFaultVnicHasWrongUplink.class})
public class IscsiFault extends VimFault {}
