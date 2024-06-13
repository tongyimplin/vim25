package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ProfileEventArgument;
import com.vmware.vim25.RoleEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventArgument")
@XmlSeeAlso({RoleEventArgument.class, EntityEventArgument.class, ProfileEventArgument.class})
public class EventArgument extends DynamicData {}
