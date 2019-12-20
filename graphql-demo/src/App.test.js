import React from 'react';
import { render } from '@testing-library/react';
import App from './components/App';

test('renders Liferay Headless', () => {
  const { getByText } = render(<App />);
  const linkElement = getByText(/Liferay Headless/i);
  expect(linkElement).toBeInTheDocument();
});
