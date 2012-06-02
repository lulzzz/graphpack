/*******************************************************************************
 * Copyright 2012 Amit Portnoy
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package graphpack.local.persistence;

import graphpack.local.Node;

/**
 * {@link graphpack.INode} abstract persistence implementor
 * @author amitport
 */
public interface INodeStore {

	/**
	 * check if a certain node exist in the store
	 * @param nodeName the name of the node
	 * @return true IFF the node exists
	 */
	boolean contains(String nodeName);
	
	/**
	 * store a new node
	 * @param nodeName the new node name
	 * @param node the new node object
	 */
	void put(String nodeName,Node node);
	
	/**
	 * get an existing node
	 * @param nodeName the node name
	 * @return a reference to the node
	 */
	Node get(String nodeName);
}
