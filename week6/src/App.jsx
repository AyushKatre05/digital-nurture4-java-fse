import React, { useState } from 'react';

export default function App() {
  const [topics, setTopics] = useState([
    { id: 1, name: 'HTML Basics', completed: false },
    { id: 2, name: 'CSS Styling', completed: false },
    { id: 3, name: 'JavaScript Basics', completed: false },
    { id: 4, name: 'React Introduction', completed: false }
  ]);

  const [newTopic, setNewTopic] = useState('');

  const toggleComplete = (id) => {
    setTopics(prev =>
      prev.map(t =>
        t.id === id ? { ...t, completed: !t.completed } : t
      )
    );
  };

  const addTopic = () => {
    if (newTopic.trim()) {
      setTopics([
        ...topics,
        { id: topics.length + 1, name: newTopic, completed: false }
      ]);
      setNewTopic('');
    }
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>🌱 Digital Nurture Tracker</h1>

      <input
        type="text"
        placeholder="Add new topic"
        value={newTopic}
        onChange={(e) => setNewTopic(e.target.value)}
      />
      <button onClick={addTopic}>Add</button>

      <ul>
        {topics.map(topic => (
          <li key={topic.id} style={{ margin: '10px 0' }}>
            <input
              type="checkbox"
              checked={topic.completed}
              onChange={() => toggleComplete(topic.id)}
            />
            <span style={{
              textDecoration: topic.completed ? 'line-through' : 'none',
              marginLeft: '10px'
            }}>
              {topic.name}
            </span>
          </li>
        ))}
      </ul>
    </div>
  );
}
